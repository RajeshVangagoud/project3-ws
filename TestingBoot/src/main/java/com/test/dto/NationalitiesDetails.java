package com.test.dto;

import org.springframework.stereotype.Component;

@Component
public class NationalitiesDetails {

	private String alpha2Code;

	private String alpha3Code;

	private String enShortName;

	private String nationality;

	/**
	 * @return the alpha2Code
	 */
	public String getAlpha2Code() {
		return alpha2Code;
	}

	/**
	 * @param alpha2Code the alpha2Code to set
	 */
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	/**
	 * @return the alpha3Code
	 */
	public String getAlpha3Code() {
		return alpha3Code;
	}

	/**
	 * @param alpha3Code the alpha3Code to set
	 */
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	/**
	 * @return the enShortName
	 */
	public String getEnShortName() {
		return enShortName;
	}

	/**
	 * @param enShortName the enShortName to set
	 */
	public void setEnShortName(String enShortName) {
		this.enShortName = enShortName;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NationalitiesDetails [alpha2Code=");
		builder.append(alpha2Code);
		builder.append(", alpha3Code=");
		builder.append(alpha3Code);
		builder.append(", enShortName=");
		builder.append(enShortName);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append("]");
		return builder.toString();
	}

}
