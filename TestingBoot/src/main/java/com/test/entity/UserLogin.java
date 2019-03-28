package com.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "UserLogin")
public class UserLogin {

	@Id
	@Column(name = "User_Id")
	@GeneratedValue
	private Integer userID;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_stayIn")
	private String stayIn;

	@Column(name = "user_logginTime")
	private Date logginTime;

	/**
	 * @return the userID
	 */
	public Integer getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

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

}
