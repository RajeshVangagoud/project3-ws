package com.test.OTPservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MobileOTP {

	public Integer sendingotp(String name, String email, String phno) {
		String success="";
		String authkey = "130491ADE9VcIY7WyB5vst82d3";
		Random rand = new Random();
		int otp = rand.nextInt(900000) + 100000;
		System.out.println(otp+" otp");
		String senderId = "ABCDEF";
		String message = "Your OTP is " + otp;
		String route = "4";
		URLConnection myURLConnection = null;
		URL myURL = null;
		BufferedReader reader = null;
		// encoding message
		String encoded_message = URLEncoder.encode(message);
		String mainUrl = "http://malussms.com/api/sendhttp.php?";
		StringBuilder sbPostData = new StringBuilder(mainUrl);
		sbPostData.append("authkey=" + authkey);
		sbPostData.append("&mobiles=" + phno);
		sbPostData.append("&message=" + encoded_message);
		sbPostData.append("&route=" + route);
		sbPostData.append("&sender=" + senderId);
		mainUrl = sbPostData.toString();
		try {
			// prepare connection
			myURL = new URL(mainUrl);
			myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			reader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
			
			 success = "Your message sent sucessfully";
			// finally close connection
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return otp;
	}
public static void main(String[] args) {
	new MobileOTP().sendingotp("", "", "9700042213");
}
}
