package com.test.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
@Component
public final class UserLoginDetails  {

	private String userID;

	private String email;

	private String password;

	private String stayIn;

	private Date logginTime;

	private Integer loggingCount;
 
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the stayIn
	 */
	public String getStayIn() {
		return stayIn;
	}

	/**
	 * @param stayIn the stayIn to set
	 */
	public void setStayIn(String stayIn) {
		this.stayIn = stayIn;
	}

	/**
	 * @return the logginTime
	 */
	public Date getLogginTime() {
		return logginTime;
	}

	/**
	 * @param logginTime the logginTime to set
	 */
	public void setLogginTime(Date logginTime) {
		this.logginTime = logginTime;
	}

	/**
	 * @return the loggingCount
	 */
	public Integer getLoggingCount() {
		return loggingCount;
	}

	/**
	 * @param loggingCount the loggingCount to set
	 */
	public void setLoggingCount(Integer loggingCount) {
		this.loggingCount = loggingCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserLoginDetails [userID=");
		builder.append(userID);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", stayIn=");
		builder.append(stayIn);
		builder.append(", logginTime=");
		builder.append(logginTime);
		builder.append(", loggingCount=");
		builder.append(loggingCount);
		builder.append("]");
		return builder.toString();
	}

}
