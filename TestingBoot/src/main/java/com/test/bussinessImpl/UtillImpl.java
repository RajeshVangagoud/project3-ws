package com.test.bussinessImpl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.test.bussiness.Util;
@Component
public class UtillImpl implements Util {

	@Override
	public String getOTP(int len) {

		System.out.println("Generating password using random() : "); 
  
        // A strong password has Cap_chars, Lower_chars, 
        // numeric value and symbols. So we are using all of 
        // them to generate our password 
        String values = "0123456789"; 
  
  
  
        // Using random method 
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
        String OTP="";
  
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            OTP=OTP+values.charAt(rndm_method.nextInt(values.length())); 

  
        } 
        return OTP.trim(); 
    }

public static void main(String[] args) {
	
	System.out.println(new UtillImpl().getOTP(4));
}
}
