package com.test.HomeServies;

import java.util.List;

import com.test.dto.PersonDetails;
import com.test.dto.UserLoginDetails;
import com.test.entity.NationalityEntity;

public interface LoginServies {

	public Boolean loginValidation(UserLoginDetails details);

	public String savenewUser(PersonDetails details);
	
	public String resetPassword(String email,String length);
	
	public String passwordUpdate(String email,String password);
	
	public List<NationalityEntity> getNationalities();

	public PersonDetails updateUser(String email);
	

}
