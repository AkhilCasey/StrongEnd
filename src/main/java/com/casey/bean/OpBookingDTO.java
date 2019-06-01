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
public class OpBookingDTO {

	private Integer bookingId;
	private Integer opId;
	private DoctorDTO doctor;
	private PatientDTO patient;

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

	/**
	 * @return the doctor
	 */
	public DoctorDTO getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(DoctorDTO doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the patient
	 */
	public PatientDTO getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "OpBooking [bookingId=" + bookingId + ", opId=" + opId + ", doctor=" + doctor + ", patient=" + patient
				+ "]";
	}

	
}
