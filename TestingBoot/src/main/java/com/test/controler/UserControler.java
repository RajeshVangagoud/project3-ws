package com.test.controler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.HomeServies.HomeServices;
import com.test.HomeServies.LoginServies;
import com.test.OTPservice.EmailFunctionality;
import com.test.dto.PersonDetails;
import com.test.repository.PersonalDetailsDAO;

@RestController
public class UserControler {

	@Autowired
	LoginServies loginServies;

	@Autowired
	Environment env;

	@Autowired
	HttpSession httpsession;

	@Autowired
	HomeServices homeServices;

	@Autowired
	EmailFunctionality sendingemail;

	@Autowired
	LoginServies loginservies;

	@RequestMapping("/newUser")
	public ModelAndView newReg() {

		return new ModelAndView("register", "getnationality", loginServies.getNationalities());

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("personDetails") PersonDetails personDetails) {
		ModelAndView andView = new ModelAndView("login");
		andView.addObject("personDetails", personDetails);
		try {
			String msg = loginServies.savenewUser(personDetails);
			andView.addObject("errormsg", msg);
		} catch (Exception e) {
			andView.addObject("errormsg", e.getMessage());
			System.out.println(e.getMessage());

		}
		return andView;
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public String resetPassword(@RequestBody String email) {
		System.out.println("eamil12 " + email);
		email = email.substring(1, (email.length() - 1));
		httpsession.setAttribute("email", email);
		System.out.println("eamil " + email);
		String len = env.getProperty("OTPLength");
		String otp = loginServies.resetPassword(email, len);
		sendingemail.sendmail(email, otp);
		System.out.println("otp " + otp + " httpSession.getAttribute(\"email\")" + httpsession.getAttribute("email"));
		return otp;
	}

	@RequestMapping(value = "/saveNewpassword", method = RequestMethod.POST)
	public ModelAndView saveNewpassword(@RequestParam("password") String password) {
		String email = (String) httpsession.getAttribute("email");
		System.out.println("email " + email + " " + password);
		String msg = loginServies.passwordUpdate(email, password);
		ModelAndView andView = new ModelAndView("login");
		andView.addObject("getcities", homeServices.getCities());
		andView.addObject("errormsg", msg);
		
		return andView;
	}

	@RequestMapping("/editUser")
	public ModelAndView editUser() {
		ModelAndView andView = new ModelAndView("register");
		//String email = (String) httpsession.getAttribute("email");
		String email="websysnergies7@gmail.com";
		PersonDetails personDetails = loginservies.updateUser(email);
		System.out.println("personDetails " + personDetails);
		return andView;
	}

	@GetMapping("/403")
	public String error403() {
		return "register";
	}
}
