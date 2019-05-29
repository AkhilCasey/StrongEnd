/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;

/**
 *
 * @author Vishnu
 */
public class ReceptionPatientRegister {
    
    public String patientname,gender,address,contact,emergencycontact,relation,emergencynumber,details,refdoctor,refhospital,refhosop;
    public Date regdate,dob;
    public int age,patientid,oldid;
    public String department,depdoctor,status;

    public int getOldid() {
        return oldid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOldid(int oldid) {
        this.oldid = oldid;
    }
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepdoctor() {
        return depdoctor;
    }

    public void setDepdoctor(String depdoctor) {
        this.depdoctor = depdoctor;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
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

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getEmergencynumber() {
        return emergencynumber;
    }

    public void setEmergencynumber(String emergencynumber) {
        this.emergencynumber = emergencynumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRefdoctor() {
        return refdoctor;
    }

    public void setRefdoctor(String refdoctor) {
        this.refdoctor = refdoctor;
    }

    public String getRefhospital() {
        return refhospital;
    }

    public void setRefhospital(String refhospital) {
        this.refhospital = refhospital;
    }

    public String getRefhosop() {
        return refhosop;
    }

    public void setRefhosop(String refhosop) {
        this.refhosop = refhosop;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
