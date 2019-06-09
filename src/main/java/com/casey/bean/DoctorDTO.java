package com.casey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Akhil
 *
 */
@Entity
@Table(name = "m_doctor")
public class DoctorDTO {
//Doctor details all here

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctor_id")
	private Integer doctorId;

	@Column(name = "doctor_name")
	private String doctorName;

	@Column(name = "doctor_qualification")
	private String doctorQualification; // eg MBBS,BAMS all separated with ","

	@Column(name = "doctor_current_address")
	private String doctorCurrentAddress;

	@Column(name = "doctor_permenant_address")
	private String doctorPermanentAddress;

	@Column(name = "doctor_gender")
	private String gender;

	@Column(name = "doctor_contact")
	private String contactNum;

	@Column(name = "doctor_adhar_details")
	private String adharCardDetails; // encrypt

	@Column(name = "doctor_pan_details")
	private String panCardDetails; // encrypt

	/**
	 * @return the doctorId
	 */
	public Integer getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the doctorQualification
	 */
	public String getDoctorQualification() {
		return doctorQualification;
	}

	/**
	 * @param doctorQualification the doctorQualification to set
	 */
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	/**
	 * @return the doctorCurrentAddress
	 */
	public String getDoctorCurrentAddress() {
		return doctorCurrentAddress;
	}

	/**
	 * @param doctorCurrentAddress the doctorCurrentAddress to set
	 */
	public void setDoctorCurrentAddress(String doctorCurrentAddress) {
		this.doctorCurrentAddress = doctorCurrentAddress;
	}

	/**
	 * @return the doctorPermanentAddress
	 */
	public String getDoctorPermanentAddress() {
		return doctorPermanentAddress;
	}

	/**
	 * @param doctorPermanentAddress the doctorPermanentAddress to set
	 */
	public void setDoctorPermanentAddress(String doctorPermanentAddress) {
		this.doctorPermanentAddress = doctorPermanentAddress;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}

	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	/**
	 * @return the adharCardDetails
	 */
	public String getAdharCardDetails() {
		return adharCardDetails;
	}

	/**
	 * @param adharCardDetails the adharCardDetails to set
	 */
	public void setAdharCardDetails(String adharCardDetails) {
		this.adharCardDetails = adharCardDetails;
	}

	/**
	 * @return the panCardDetails
	 */
	public String getPanCardDetails() {
		return panCardDetails;
	}

	/**
	 * @param panCardDetails the panCardDetails to set
	 */
	public void setPanCardDetails(String panCardDetails) {
		this.panCardDetails = panCardDetails;
	}

}
