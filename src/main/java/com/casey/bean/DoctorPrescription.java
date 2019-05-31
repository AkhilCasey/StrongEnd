/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Timestamp;

/**
 * 
 * @author Akhil
 *
 */
public class DoctorPrescription {
    
    
   private String name;
   private String diagonosis;
   private String treatement;
   private String testName;
   private String result;
   private String status;
   private String haematology;
   private String urine;
   private String sputum;
   private String feaces;
   private String serology;
   private String bioChem;
   private String hormone;
   private Integer reportID;
   private Integer patientID;
   private Integer doctorID;
   private Integer labTechId;
   private Integer siNo;
   private Timestamp date;
   private Timestamp prescribedDate;
 
    private Integer medicalReportId;
    private Integer prescriptionid;
    private String medicineName;
    private String usage;
    private String duration;
    private String day;
    private String quantity;
    private String comments;
    private float mrp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiagonosis() {
		return diagonosis;
	}
	public void setDiagonosis(String diagonosis) {
		this.diagonosis = diagonosis;
	}
	public String getTreatement() {
		return treatement;
	}
	public void setTreatement(String treatement) {
		this.treatement = treatement;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHaematology() {
		return haematology;
	}
	public void setHaematology(String haematology) {
		this.haematology = haematology;
	}
	public String getUrine() {
		return urine;
	}
	public void setUrine(String urine) {
		this.urine = urine;
	}
	public String getSputum() {
		return sputum;
	}
	public void setSputum(String sputum) {
		this.sputum = sputum;
	}
	public String getFeaces() {
		return feaces;
	}
	public void setFeaces(String feaces) {
		this.feaces = feaces;
	}
	public String getSerology() {
		return serology;
	}
	public void setSerology(String serology) {
		this.serology = serology;
	}
	public String getBioChem() {
		return bioChem;
	}
	public void setBioChem(String bioChem) {
		this.bioChem = bioChem;
	}
	public String getHormone() {
		return hormone;
	}
	public void setHormone(String hormone) {
		this.hormone = hormone;
	}
	public Integer getReportID() {
		return reportID;
	}
	public void setReportID(Integer reportID) {
		this.reportID = reportID;
	}
	public Integer getPatientID() {
		return patientID;
	}
	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}
	public Integer getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}
	public Integer getLabTechId() {
		return labTechId;
	}
	public void setLabTechId(Integer labTechId) {
		this.labTechId = labTechId;
	}
	public Integer getSiNo() {
		return siNo;
	}
	public void setSiNo(Integer siNo) {
		this.siNo = siNo;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Timestamp getPrescribedDate() {
		return prescribedDate;
	}
	public void setPrescribedDate(Timestamp prescribedDate) {
		this.prescribedDate = prescribedDate;
	}
	public Integer getMedicalReportId() {
		return medicalReportId;
	}
	public void setMedicalReportId(Integer medicalReportId) {
		this.medicalReportId = medicalReportId;
	}
	public Integer getPrescriptionid() {
		return prescriptionid;
	}
	public void setPrescriptionid(Integer prescriptionid) {
		this.prescriptionid = prescriptionid;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public float getMrp() {
		return mrp;
	}
	public void setMrp(float mrp) {
		this.mrp = mrp;
	}
	@Override
	public String toString() {
		return "DoctorPrescription [name=" + name + ", diagonosis=" + diagonosis + ", treatement=" + treatement
				+ ", testName=" + testName + ", result=" + result + ", status=" + status + ", haematology="
				+ haematology + ", urine=" + urine + ", sputum=" + sputum + ", feaces=" + feaces + ", serology="
				+ serology + ", bioChem=" + bioChem + ", hormone=" + hormone + ", reportID=" + reportID + ", patientID="
				+ patientID + ", doctorID=" + doctorID + ", labTechId=" + labTechId + ", siNo=" + siNo + ", date="
				+ date + ", prescribedDate=" + prescribedDate + ", medicalReportId=" + medicalReportId
				+ ", prescriptionid=" + prescriptionid + ", medicineName=" + medicineName + ", usage=" + usage
				+ ", duration=" + duration + ", day=" + day + ", quantity=" + quantity + ", comments=" + comments
				+ ", mrp=" + mrp + "]";
	}

   
    
}
