/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

/**
 * 
 * @author Akhil
 *
 */
public class OpBooking {

	private Integer bookingId;
	private Integer opId;
	private Integer docId;
	private String name;
	private String date;
	private String address;
	private String docName;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getOpId() {
		return opId;
	}
	public void setOpId(Integer opId) {
		this.opId = opId;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	@Override
	public String toString() {
		return "OpBooking [bookingId=" + bookingId + ", opId=" + opId + ", docId=" + docId + ", name=" + name
				+ ", date=" + date + ", address=" + address + ", docName=" + docName + "]";
	}

	
}
