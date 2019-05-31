/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 
 * @author Akhil
 *
 */
public class LaboratoryBean {

	private String status;
	private String result;
	private String testName;
	private Integer siNo;
	private Integer reportId;
	private Integer patientId;
	private Integer labTechnicianId;
	private Integer doctorId;
	private Date startDate;
	private Date endDate;
	private Timestamp prescribedDate;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Integer getSiNo() {
		return siNo;
	}
	public void setSiNo(Integer siNo) {
		this.siNo = siNo;
	}
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getLabTechnicianId() {
		return labTechnicianId;
	}
	public void setLabTechnicianId(Integer labTechnicianId) {
		this.labTechnicianId = labTechnicianId;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Timestamp getPrescribedDate() {
		return prescribedDate;
	}
	public void setPrescribedDate(Timestamp prescribedDate) {
		this.prescribedDate = prescribedDate;
	}
	@Override
	public String toString() {
		return "LaboratoryBean [status=" + status + ", result=" + result + ", testName=" + testName + ", siNo=" + siNo
				+ ", reportId=" + reportId + ", patientId=" + patientId + ", labTechnicianId=" + labTechnicianId
				+ ", doctorId=" + doctorId + ", startDate=" + startDate + ", endDate=" + endDate + ", prescribedDate="
				+ prescribedDate + "]";
	}

	

}
