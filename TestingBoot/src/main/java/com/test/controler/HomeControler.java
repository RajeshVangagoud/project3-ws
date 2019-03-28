package com.test.controler;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.HomeServies.HomeServices;
import com.test.HomeServies.LoginServies;
import com.test.OTPservice.MobileOTP;
import com.test.dto.UserLoginDetails;

@RestController
public class HomeControler {

	@Autowired
	MobileOTP mobileOTP;

	@Autowired
	HomeServices homeServices;

	@Autowired
	LoginServies loginServies;
	@Autowired
	HttpSession httpsession;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("login");
		andView.addObject("getcities", homeServices.getCities());
		return andView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("userLoginDetails") UserLoginDetails userLoginDetails) {
		System.out.println("details " + userLoginDetails);
		httpsession.setAttribute("email", userLoginDetails.getEmail());
		userLoginDetails.setLoggingCount(1);
		userLoginDetails.setLogginTime(new Date());
		userLoginDetails.setUserID("1");
		Boolean result = loginServies.loginValidation(userLoginDetails);
		ModelAndView andView = null;

		if (result == true) {
			andView = new ModelAndView("home");
		} else {

			andView = new ModelAndView("login");
			andView.addObject("errormsg", "Username and Password incorrect");
		}
		return andView;

	}

	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword() {
		ModelAndView andView = new ModelAndView("forgotPassword");
		return andView;
	}

	@RequestMapping(value = "/sendingOTP", method = RequestMethod.POST)
	public ModelAndView sendingOTP(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("phone") String phone) {
		System.out.println("a " + name + " " + email + " " + phone);
		Integer otp = mobileOTP.sendingotp(name, email, phone);
		ModelAndView andView = new ModelAndView("otp");
		andView.addObject("otp", otp);
		System.out.println("final otp " + otp);
		return andView;

	}

	@RequestMapping(value = "/newPassword")
	public ModelAndView resetPassword() {
		String email = (String) httpsession.getAttribute("email");
		return new ModelAndView("resetPassword", "email", email);
	}

}