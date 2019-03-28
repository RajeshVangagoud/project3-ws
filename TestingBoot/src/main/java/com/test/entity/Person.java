package com.test.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person_tab")
public class Person implements Serializable {

	@Column(name = "pid")
	private Integer pid;

	@Column(name = "User_title", length = 25)
	private String title;

	@Column(name = "firstName", length = 25)
	private String firstName;

	@Column(name = "middleName", length = 25)
	private String middleName;

	@Column(name = "lastName", length = 25)
	private String lastName;

	@Column(name = "persondob")
	private Date persondob;

	@Column(name = "nationality", length = 25)
	private String nationality;

	@Column(name = "sourceOfFunds", length = 25)
	private String sourceOfFunds;

	@Column(name = "employeeStaus", length = 25)
	private String employeeStaus;

	@Column(name = "IntenededUseOfAccount", length = 25)
	private String IntenededUseOfAccount;

	@Column(name = "referralCode", length = 25)
	private String referralCode;

	@Column(name = "industryType", length = 25)
	private String industryType;

	@Column(name = "PEP")
	private boolean PEP;

	@Column(name = "netWorth", length = 25)
	private String netWorth;

	@Column(name = "User_dualCitizen")
	private boolean dualCitizen;
	@Id
	@Column(name = "User_email", length = 25, nullable = false,unique=true)
	private String email;

	@Column(name = "User_password", length = 25)
	private String password;

	@Column(name = "created_Date")
	private Date createdon;

	@Column(name = "status", length = 25)
	private Integer status;

	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the persondob
	 */
	public Date getPersondob() {
		return persondob;
	}

	/**
	 * @param persondob the persondob to set
	 */
	public void setPersondob(Date persondob) {
		this.persondob = persondob;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the sourceOfFunds
	 */
	public String getSourceOfFunds() {
		return sourceOfFunds;
	}

	/**
	 * @param sourceOfFunds the sourceOfFunds to set
	 */
	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}

	/**
	 * @return the employeeStaus
	 */
	public String getEmployeeStaus() {
		return employeeStaus;
	}

	/**
	 * @param employeeStaus the employeeStaus to set
	 */
	public void setEmployeeStaus(String employeeStaus) {
		this.employeeStaus = employeeStaus;
	}

	/**
	 * @return the intenededUseOfAccount
	 */
	public String getIntenededUseOfAccount() {
		return IntenededUseOfAccount;
	}

	/**
	 * @param intenededUseOfAccount the intenededUseOfAccount to set
	 */
	public void setIntenededUseOfAccount(String intenededUseOfAccount) {
		IntenededUseOfAccount = intenededUseOfAccount;
	}

	/**
	 * @return the referralCode
	 */
	public String getReferralCode() {
		return referralCode;
	}

	/**
	 * @param referralCode the referralCode to set
	 */
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	/**
	 * @return the industryType
	 */
	public String getIndustryType() {
		return industryType;
	}

	/**
	 * @param industryType the industryType to set
	 */
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	/**
	 * @return the pEP
	 */
	public boolean isPEP() {
		return PEP;
	}

	/**
	 * @param pEP the pEP to set
	 */
	public void setPEP(boolean pEP) {
		PEP = pEP;
	}

	/**
	 * @return the netWorth
	 */
	public String getNetWorth() {
		return netWorth;
	}

	/**
	 * @param netWorth the netWorth to set
	 */
	public void setNetWorth(String netWorth) {
		this.netWorth = netWorth;
	}

	/**
	 * @return the dualCitizen
	 */
	public boolean isDualCitizen() {
		return dualCitizen;
	}

	/**
	 * @param dualCitizen the dualCitizen to set
	 */
	public void setDualCitizen(boolean dualCitizen) {
		this.dualCitizen = dualCitizen;
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
	 * @return the createdon
	 */
	public Date getCreatedon() {
		return createdon;
	}

	/**
	 * @param createdon the createdon to set
	 */
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [pid=");
		builder.append(pid);
		builder.append(", title=");
		builder.append(title);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", persondob=");
		builder.append(persondob);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", sourceOfFunds=");
		builder.append(sourceOfFunds);
		builder.append(", employeeStaus=");
		builder.append(employeeStaus);
		builder.append(", IntenededUseOfAccount=");
		builder.append(IntenededUseOfAccount);
		builder.append(", referralCode=");
		builder.append(referralCode);
		builder.append(", industryType=");
		builder.append(industryType);
		builder.append(", PEP=");
		builder.append(PEP);
		builder.append(", netWorth=");
		builder.append(netWorth);
		builder.append(", dualCitizen=");
		builder.append(dualCitizen);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", createdon=");
		builder.append(createdon);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

}
