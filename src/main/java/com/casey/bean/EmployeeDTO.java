/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;

/**
 * 
 * @author Akhil
 *
 */
public class EmployeeDTO {

	// Variables for non-Doctor employees.
	private Integer empId;
	private Integer accessPrivilege;
	private long phone;
	private Integer jobStatus;
	private String password;
	private String name;
	private String gender;
	private String address;
	private String designation;
	private String qualifications;
	private String jobType;
	private String email;
	private String bloodGroup;
	private Date dateBirth;
	private Date dateRegistration;
	private String adharCardDetails;
	private String panCardDetails;
	// private DepartmentDTO department;
	// other relationship to be implemented.

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the accessPrivilege
	 */
	public Integer getAccessPrivilege() {
		return accessPrivilege;
	}

	/**
	 * @param accessPrivilege the accessPrivilege to set
	 */
	public void setAccessPrivilege(Integer accessPrivilege) {
		this.accessPrivilege = accessPrivilege;
	}

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	/**
	 * @return the jobStatus
	 */
	public Integer getJobStatus() {
		return jobStatus;
	}

	/**
	 * @param jobStatus the jobStatus to set
	 */
	public void setJobStatus(Integer jobStatus) {
		this.jobStatus = jobStatus;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the qualifications
	 */
	public String getQualifications() {
		return qualifications;
	}

	/**
	 * @param qualifications the qualifications to set
	 */
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	/**
	 * @return the jobType
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
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
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the dateBirth
	 */
	public Date getDateBirth() {
		return dateBirth;
	}

	/**
	 * @param dateBirth the dateBirth to set
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	/**
	 * @return the dateRegistration
	 */
	public Date getDateRegistration() {
		return dateRegistration;
	}

	/**
	 * @param dateRegistration the dateRegistration to set
	 */
	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
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

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", accessPrivilege=" + accessPrivilege + ", phone=" + phone
				+ ", jobStatus=" + jobStatus + ", password=" + password + ", name=" + name + ", gender=" + gender
				+ ", address=" + address + ", designation=" + designation + ", qualifications=" + qualifications
				+ ", jobType=" + jobType + ", email=" + email + ", bloodGroup=" + bloodGroup + ", dateBirth="
				+ dateBirth + ", dateRegistration=" + dateRegistration + ", adharCardDetails=" + adharCardDetails
				+ ", panCardDetails=" + panCardDetails + "]";
	}


}
