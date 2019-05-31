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
public class IPRegister {
	private String patientName;
	private String gender;
	private String address;
	private String contact;
	private String emergencyContact;
	private String relation;
	private String emergencyNumber;
	private String details;
	private String refDoctor;
	private String refHospital;
	private String refHosOP;
	private Date regDate;
	private Date dob;
	private Date currentDate;
	private Integer age;
	private Integer patientId;
	public String department;
	private String doctor;
	private String ipStatus;
	private Integer roomId;
	private Integer treatmentId;
	private Integer ipId;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getRefDoctor() {
		return refDoctor;
	}
	public void setRefDoctor(String refDoctor) {
		this.refDoctor = refDoctor;
	}
	public String getRefHospital() {
		return refHospital;
	}
	public void setRefHospital(String refHospital) {
		this.refHospital = refHospital;
	}
	public String getRefHosOP() {
		return refHosOP;
	}
	public void setRefHosOP(String refHosOP) {
		this.refHosOP = refHosOP;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getIpStatus() {
		return ipStatus;
	}
	public void setIpStatus(String ipStatus) {
		this.ipStatus = ipStatus;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Integer getTreatmentId() {
		return treatmentId;
	}
	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}
	public Integer getIpId() {
		return ipId;
	}
	public void setIpId(Integer ipId) {
		this.ipId = ipId;
	}
	@Override
	public String toString() {
		return "IPRegister [patientName=" + patientName + ", gender=" + gender + ", address=" + address + ", contact="
				+ contact + ", emergencyContact=" + emergencyContact + ", relation=" + relation + ", emergencyNumber="
				+ emergencyNumber + ", details=" + details + ", refDoctor=" + refDoctor + ", refHospital=" + refHospital
				+ ", refHosOP=" + refHosOP + ", regDate=" + regDate + ", dob=" + dob + ", currentDate=" + currentDate
				+ ", age=" + age + ", patientId=" + patientId + ", department=" + department + ", doctor=" + doctor
				+ ", ipStatus=" + ipStatus + ", roomId=" + roomId + ", treatmentId=" + treatmentId + ", ipId=" + ipId
				+ "]";
	}

	
}
