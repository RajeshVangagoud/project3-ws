package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
 final public class NationalityEntity {

	@Id
	@Column
	private Integer num_code;
	@Column
	private String alpha_2_code;

	@Column
	private String alpha_3_code;
	@Column
	private String en_short_name;
	@Column
	private String nationality;

	/**
	 * @return the num_code
	 */
	public Integer getNum_code() {
		return num_code;
	}

	/**
	 * @param num_code the num_code to set
	 */
	public void setNum_code(Integer num_code) {
		this.num_code = num_code;
	}

	/**
	 * @return the alpha_2_code
	 */
	public String getAlpha_2_code() {
		return alpha_2_code;
	}

	/**
	 * @param alpha_2_code the alpha_2_code to set
	 */
	public void setAlpha_2_code(String alpha_2_code) {
		this.alpha_2_code = alpha_2_code;
	}

	/**
	 * @return the alpha_3_code
	 */
	public String getAlpha_3_code() {
		return alpha_3_code;
	}

	/**
	 * @param alpha_3_code the alpha_3_code to set
	 */
	public void setAlpha_3_code(String alpha_3_code) {
		this.alpha_3_code = alpha_3_code;
	}

	/**
	 * @return the en_short_name
	 */
	public String getEn_short_name() {
		return en_short_name;
	}

	/**
	 * @param en_short_name the en_short_name to set
	 */
	public void setEn_short_name(String en_short_name) {
		this.en_short_name = en_short_name;
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
		builder.append("NationalityEntity [num_code=");
		builder.append(num_code);
		builder.append(", alpha_2_code=");
		builder.append(alpha_2_code);
		builder.append(", alpha_3_code=");
		builder.append(alpha_3_code);
		builder.append(", en_short_name=");
		builder.append(en_short_name);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append("]");
		return builder.toString();
	}

}
