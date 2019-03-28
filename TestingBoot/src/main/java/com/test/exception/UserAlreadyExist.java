package com.test.exception;

import org.springframework.stereotype.Component;

@Component
public class UserAlreadyExist extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7745457148782859370L;

	public UserAlreadyExist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyExist(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyExist(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyExist(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyExist(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
