/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

/**
 *
 * @author d06521
 */
public class adminBean {
    
    
    String Department,Head,Floor,Location;
    int phone;
    
    String doctor;

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    int treatementid;
    String treatementtype;
    float amount;

    public int getTreatementid() {
        return treatementid;
    }

    public void setTreatementid(int treatementid) {
        this.treatementid = treatementid;
    }

    public String getTreatementtype() {
        return treatementtype;
    }

    public void setTreatementtype(String treatementtype) {
        this.treatementtype = treatementtype;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String Head) {
        this.Head = Head;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String Floor) {
        this.Floor = Floor;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

  
    
}
