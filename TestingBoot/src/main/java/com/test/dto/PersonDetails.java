package com.test.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Component
public class PersonDetails {

	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String persondob;
	private String nationality;
	private String sourceOfFunds;
	private String employeeStaus;
	private String IntenededUseOfAccount;
	private String referralCode;
	private String industryType;
	private boolean PEP;
	private String netWorth;
	private boolean dualCitizen;
	private String email;
	private String password;

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
	public String getPersondob() {
		return persondob;
	}

	/**
	 * @param persondob the persondob to set
	 */
	public void setPersondob(String persondob) {
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

	public PersonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonDetails [title=");
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
		builder.append("]");
		return builder.toString();
	}

}
