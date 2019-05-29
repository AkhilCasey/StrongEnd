/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Timestamp;
import java.sql.Date;

/**
 *
 * @author D06507
 */
public class DoctorPrescription {
    
    
    String name,diagonosis,treatement,test_name,Result,Status,Haematology,Urine,Sputum,Feaces,Serology,BioChem,Hormone;
    int ReportID,Patient_ID,Doctor_ID,LabTech_Id,Si_No;
    Timestamp date,PrescribedDate;
 
    private int medicalReportId,prescriptionid;
    private String medicineName,duration ;
    public String usage,day,quantity;
    private String comments;
    float mrp;

    public int getPrescriptionid() {
        return prescriptionid;
    }

    public void setPrescriptionid(int prescriptionid) {
        this.prescriptionid = prescriptionid;
    }
    
    

    public int getMedicalReportId() {
        return medicalReportId;
    }

    public void setMedicalReportId(int medicalReportId) {
        this.medicalReportId = medicalReportId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
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
    
    
    
    
    public Timestamp getPrescribedDate() {
        return PrescribedDate;
    }

    public void setPrescribedDate(Timestamp PrescribedDate) {
        this.PrescribedDate = PrescribedDate;
    }
    

   
    

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getLabTech_Id() {
        return LabTech_Id;
    }

    public void setLabTech_Id(int LabTech_Id) {
        this.LabTech_Id = LabTech_Id;
    }

    public int getSi_No() {
        return Si_No;
    }

    public void setSi_No(int Si_No) {
        this.Si_No = Si_No;
    }

    
    

    public int getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(int Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public int getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(int Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    

    public int getReportID() {
        return ReportID;
    }

    public void setReportID(int ReportID) {
        this.ReportID = ReportID;
    }

   

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

    public String getHaematology() {
        return Haematology;
    }

    public void setHaematology(String Haematology) {
        this.Haematology = Haematology;
    }

    public String getUrine() {
        return Urine;
    }

    public void setUrine(String Urine) {
        this.Urine = Urine;
    }

    public String getSputum() {
        return Sputum;
    }

    public void setSputum(String Sputum) {
        this.Sputum = Sputum;
    }

    public String getFeaces() {
        return Feaces;
    }

    public void setFeaces(String Feaces) {
        this.Feaces = Feaces;
    }

    public String getSerology() {
        return Serology;
    }

    public void setSerology(String Serology) {
        this.Serology = Serology;
    }

    public String getBioChem() {
        return BioChem;
    }

    public void setBioChem(String BioChem) {
        this.BioChem = BioChem;
    }

    public String getHormone() {
        return Hormone;
    }

    public void setHormone(String Hormone) {
        this.Hormone = Hormone;
    }
    
    
    
}
