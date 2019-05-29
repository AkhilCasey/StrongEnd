/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;

/**
 *
 * @author D06507
 */
public class SiddhaEmployee {

    public static final int ADMIN_ACCESS_PRIVILEGE = 1;
    public static final int DOCTOR_ACCESS_PRIVILEGE = 3;
    public static final int PHARMACIST_ACCESS_PRIVILEGE = 5;
    public static final int LAB_TECHNICIAN_ACCESS_PRIVILEGE = 4;
    public static final int RECEPTION_ACCESS_PRIVILEGE = 2;
    public static final int IP_ACESS_PRIVILEGE = 6;
    public static final int STORE_KEEPER_PRIVILEGE = 7;

    public static final int LIVE_JOB_STATUS = 1;
    public static final int LEFT_JOB_STATUS = 2;
    public static final int REJOIN_JOB_STATUS = 3;
     public static final int INTERN_JOB_STATUS = 4;
    
    //Variables
    private int emp_id, Access_privilege;
    private long phone;
    private int Job_status;
    private String password, name, gender, address, department, designation, qualifications;
    private String Job_type, email, Blood_group;
    Date Date_birth, Date_registration;

    
    
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getBlood_group() {
        return Blood_group;
    }

    public void setBlood_group(String Blood_group) {
        this.Blood_group = Blood_group;
    }

    public int getAccess_privilege() {
        return Access_privilege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getJob_type() {
        return Job_type;
    }

    public void setJob_type(String Job_type) {
        this.Job_type = Job_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_birth() {
        return Date_birth;
    }

    public void setDate_birth(Date Date_birth) {
        this.Date_birth = Date_birth;
    }

    public Date getDate_registration() {
        return Date_registration;
    }

    public void setDate_registration(Date Date_registration) {
        this.Date_registration = Date_registration;
    }

    public void setAccess_privilege(int Access_privilege) {
        this.Access_privilege = Access_privilege;
    }

    public int getJob_status() {
        return Job_status;
    }

    public void setJob_status(int Job_status) {
        this.Job_status = Job_status;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
