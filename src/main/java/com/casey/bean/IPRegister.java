/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;

/**
 *
 * @author d06521
 */
public class IPRegister {
    public String patientname,gender,address,contact,emergencycontact,relation,emergencynumber,details,refdoctor,refhospital,refhosop;
    public Date regdate,dob,currentdate;
    public int age,patientid;
    public String Department,Doctor,ipstatus;
    public int roomid,treatmentid,ipid;
    

    public Date getCurrentdate() {
        return currentdate;
    }

    public String getIpstatus() {
        return ipstatus;
    }

    public void setIpstatus(String ipstatus) {
        this.ipstatus = ipstatus;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public float getTreatmentamount() {
        return treatmentamount;
    }

    public void setTreatmentamount(float treatmentamount) {
        this.treatmentamount = treatmentamount;
    }

    public float getRoomrent() {
        return roomrent;
    }

    public void setRoomrent(float roomrent) {
        this.roomrent = roomrent;
    }
    float treatmentamount,roomrent;

    public int getIpid() {
        return ipid;
    }

    public void setIpid(int ipid) {
        this.ipid = ipid;
    }

    public float getAddpayment() {
        return addpayment;
    }

    public void setAddpayment(float addpayment) {
        this.addpayment = addpayment;
    }
    public String roomtype,treatmenttype;

    public float getOther() {
        return other;
    }

    public void setOther(float other) {
        this.other = other;
    }
    public float Advance,balance,total,other,addpayment;

    public int getRoomid() {
        return roomid;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getAdvance() {
        return Advance;
    }

    public void setAdvance(float Advance) {
        this.Advance = Advance;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public int getTreatmentid() {
        return treatmentid;
    }

    public void setTreatmentid(int treatmentid) {
        this.treatmentid = treatmentid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getTreatmenttype() {
        return treatmenttype;
    }

    public void setTreatmenttype(String treatmenttype) {
        this.treatmenttype = treatmenttype;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    public float price,amount;
    

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
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
