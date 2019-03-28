package com.test.HomeServiesImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.test.HomeServies.LoginServies;
import com.test.OTPservice.EmailFunctionality;
import com.test.bussiness.Util;
import com.test.dto.PersonDetails;
import com.test.dto.UserLoginDetails;
import com.test.entity.NationalityEntity;
import com.test.entity.Person;
import com.test.entity.UserLogin;
import com.test.exception.UserAlreadyExist;
import com.test.repository.LoginDAO;
import com.test.repository.NationalitiesDAO;
import com.test.repository.PersonalDetailsDAO;

@Service
public class LoginServicesImpl implements LoginServies {

	@Autowired
	LoginDAO loginDAO;

	@Autowired
	PersonalDetailsDAO persondao;

	@Autowired
	Util utill;

	@Autowired
	NationalitiesDAO nationalitiesDAO;

	@Autowired
	Environment environment;

	public Boolean loginValidation(UserLoginDetails details) {
		UserLogin login = null;
		if (null != details) {
			login = new UserLogin();
			BeanUtils.copyProperties(details, login);
			login.setLogginTime(new Date());
		}
		loginDAO.save(login);
		Person person = persondao.loginValidation(details.getEmail(), details.getPassword());

		if (person == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public String savenewUser(PersonDetails details) {
		String result = "";
		Person person = null;

		if (null != details) {
			Optional<Person> person2 = persondao.findById(details.getEmail());
			if (person2 != null) {

				throw new UserAlreadyExist(environment.getProperty("User_Exist_MSG"));

			} else {
				person = new Person();
				try {
					person.setPersondob(new SimpleDateFormat("dd/MM/yyyy").parse(details.getPersondob()));
					BeanUtils.copyProperties(details, person);
					person.setCreatedon(new Date());
					person.setStatus(1);
					persondao.save(person);
					result = "Successfully Saved";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					result = "Fail to save ";
					e.printStackTrace();
				}
			}
		}
//	System.out.println("id "+id);
		return result;
	}

	@Override
	public String resetPassword(String email, String lentgh) {

		Optional<Person> person = null;
		Person person2 = null;
		if (email != null && lentgh != null) {
			person2 = new Person();
			person2 = persondao.getByEmail(email);
			person = persondao.findById(email);
		}
		if (null != person || null != person2) {

			return utill.getOTP(Integer.parseInt(lentgh));
		} else
			// return utill.getOTP(Integer.parseInt(lentgh));

			return "Email not register with us...!";
	}

	@Override
	public String passwordUpdate(String email, String password) {
		Person person = null;
		String msg = "";
		if (email != null && password != null) {

			person = new Person();
			person.setEmail(email);
			person.setPassword(password);
			Person retun = persondao.save(person);
			if (retun != null) {
				msg = "Successfully updated";
			} else {
				msg = "Failed";
			}
		}
		return msg;
	}

	@Override
	public List<NationalityEntity> getNationalities() {

		return nationalitiesDAO.findAll();
	}

	@Override
	public PersonDetails updateUser(String email) {
		System.out.println("email " + email);
		final Optional<Person> person = persondao.findById(email);
		final Person person2 = persondao.getByEmail(email);
		PersonDetails details = null;
		if (person2 != null) {
			details = new PersonDetails();
			BeanUtils.copyProperties(person2, details);
		}

		System.out.println("person2 " + person2);
		System.out.println("details " + details);
		return details;
	}

}
