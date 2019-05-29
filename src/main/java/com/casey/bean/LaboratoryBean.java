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
 * @author D06515
 */
public class LaboratoryBean {

    String status,result,testname; 
    int slno, reportid,patientid,labtechnicianid,doctorid;
    Date startdate,enddate;
    Timestamp Prescribed_Date;

    public Timestamp getPrescribed_Date() {
        return Prescribed_Date;
    }

    public void setPrescribed_Date(Timestamp Prescribed_Date) {
        this.Prescribed_Date = Prescribed_Date;
    }

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

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getLabtechnicianid() {
        return labtechnicianid;
    }

    public void setLabtechnicianid(int labtechnicianid) {
        this.labtechnicianid = labtechnicianid;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }




    
}
