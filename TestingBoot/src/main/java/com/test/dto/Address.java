package com.test.dto;

import org.springframework.stereotype.Component;

@Component
public class Address {

	
	private String typePostalCode;
	private String blockNumber;
	private String streetNumber;
	private String street;
	private String unitNumber;
	private String postalCode;
	
	/**
	 * @return the typePostalCode
	 */
	public String getTypePostalCode() {
		return typePostalCode;
	}
	/**
	 * @param typePostalCode the typePostalCode to set
	 */
	public void setTypePostalCode(String typePostalCode) {
		this.typePostalCode = typePostalCode;
	}
	/**
	 * @return the blockNumber
	 */
	public String getBlockNumber() {
		return blockNumber;
	}
	/**
	 * @param blockNumber the blockNumber to set
	 */
	public void setBlockNumber(String blockNumber) {
		this.blockNumber = blockNumber;
	}
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the unitNumber
	 */
	public String getUnitNumber() {
		return unitNumber;
	}
	/**
	 * @param unitNumber the unitNumber to set
	 */
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
}
