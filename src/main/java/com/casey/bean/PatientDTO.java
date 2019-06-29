package com.casey.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

/**
 * 
 * @author Akhil
 *
 */
@Entity
@Table(name = "m_patientdata")
public class PatientDTO implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 1L;

	// personal data
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "m_patientid")
	private Integer patientId;

	@Column(name = "m_patientoldid")
	private Integer oldId;

	@Column(name = "m_patientname")
	private String patientname;

	@Column(name = "m_patientage")
	private Integer age;

	@Column(name = "m_patientgender")
	private String gender;

	@Column(name = "m_patientaddress")
	private String address;

	@Column(name = "m_patientphone")
	private String contact;

	@Column(name = "m_patientemergencycontactname")
	private String emergencyContactName;

	@Column(name = "m_patientemergencyrelation")
	private String relation;

	@Column(name = "m_patientemergencycontactphone")
	private String emergencyContactNumber;

	@Column(name = "m_patientdetails")
	private String details;

	// came to see which doctor details here
	@Column(name = "m_created")
	private Date regDate;

	@Column(name = "m_patientdob")
	private Date dob;

	@Column(name = "m_patientdepartment")
	private String department;

	@Column(name = "m_patientdoctor")
	private String depDoctor;

	@Column(name = "m_patientstatus")
	private String status;

	// reference if any
	@Column(name = "m_patientrefdoctor")
	private String refDoctor;

	@Column(name = "m_patientrefhospital")
	private String refHospital;

	/**
	 * @return the patientId
	 */
	public Integer getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the oldId
	 */
	public Integer getOldId() {
		return oldId;
	}

	/**
	 * @param oldId the oldId to set
	 */
	public void setOldId(Integer oldId) {
		this.oldId = oldId;
	}

	/**
	 * @return the patientname
	 */
	public String getPatientname() {
		return patientname;
	}

	/**
	 * @param patientname the patientname to set
	 */
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
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
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the emergencyContactName
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * @param emergencyContactName the emergencyContactName to set
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * @return the emergencyContactNumber
	 */
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	/**
	 * @param emergencyContactNumber the emergencyContactNumber to set
	 */
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the refDoctor
	 */
	public String getRefDoctor() {
		return refDoctor;
	}

	/**
	 * @param refDoctor the refDoctor to set
	 */
	public void setRefDoctor(String refDoctor) {
		this.refDoctor = refDoctor;
	}

	/**
	 * @return the refHospital
	 */
	public String getRefHospital() {
		return refHospital;
	}

	/**
	 * @param refHospital the refHospital to set
	 */
	public void setRefHospital(String refHospital) {
		this.refHospital = refHospital;
	}

	/**
	 * @return the regDate
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the depDoctor
	 */
	public String getDepDoctor() {
		return depDoctor;
	}

	/**
	 * @param depDoctor the depDoctor to set
	 */
	public void setDepDoctor(String depDoctor) {
		this.depDoctor = depDoctor;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", oldId=" + oldId + ", patientname=" + patientname + ", age="
				+ age + ", gender=" + gender + ", address=" + address + ", contact=" + contact
				+ ", emergencyContactName=" + emergencyContactName + ", relation=" + relation
				+ ", emergencyContactNumber=" + emergencyContactNumber + ", details=" + details + ", refDoctor="
				+ refDoctor + ", refHospital=" + refHospital + ", regDate=" + regDate + ", dob=" + dob + ", department="
				+ department + ", depDoctor=" + depDoctor + ", status=" + status + "]";
	}

}
