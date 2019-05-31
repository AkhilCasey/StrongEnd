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
public class AdminDTO {

	private String department;
	private String head;
	private String floor;
	private String location;
	private Integer phone;
	private String doctor;
	private Integer treatementid;
	private String treatementtype;
	private float amount;

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public void setTreatementid(Integer treatementid) {
		this.treatementid = treatementid;
	}

	@Override
	public String toString() {
		return "AdminDTO [department=" + department + ", head=" + head + ", floor=" + floor + ", location=" + location
				+ ", phone=" + phone + ", doctor=" + doctor + ", treatementid=" + treatementid + ", treatementtype="
				+ treatementtype + ", amount=" + amount + "]";
	}

}
