/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

/**
 *
 * @author D06507
 */
public class OpBooking {
    
    int BookingID,OpId,DocId;
    String Name,Date,Address,DocName;

    public String getName() {
        return Name;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
    }

    public int getOpId() {
        return OpId;
    }

    public void setOpId(int OpId) {
        this.OpId = OpId;
    }

    public int getDocId() {
        return DocId;
    }

    public void setDocId(int DocId) {
        this.DocId = DocId;
    }

  

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
}
