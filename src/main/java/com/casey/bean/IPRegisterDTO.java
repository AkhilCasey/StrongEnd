/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.util.Date;

/**
 * 
 * @author Akhil
 *
 */
public class IPRegisterDTO {

	private Integer ipId;
	private PatientDTO patient;
	private TreatmentDTO treatment;
	private RoomDTO room;
	private Integer roomId;
	private Integer bedId;
	private Date createdDate;
	private Date updatedDate;
	private Integer oldIpId;
	private String status;

	/**
	 * @return the room
	 */
	public RoomDTO getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(RoomDTO room) {
		this.room = room;
	}

	/**
	 * @return the roomId
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the bedId
	 */
	public Integer getBedId() {
		return bedId;
	}

	/**
	 * @param bedId the bedId to set
	 */
	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}

	/**
	 * @return the ipId
	 */
	public Integer getIpId() {
		return ipId;
	}

	/**
	 * @param ipId the ipId to set
	 */
	public void setIpId(Integer ipId) {
		this.ipId = ipId;
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

	/**
	 * @return the treatment
	 */
	public TreatmentDTO getTreatment() {
		return treatment;
	}

	/**
	 * @param treatment the treatment to set
	 */
	public void setTreatment(TreatmentDTO treatment) {
		this.treatment = treatment;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the oldIpId
	 */
	public Integer getOldIpId() {
		return oldIpId;
	}

	/**
	 * @param oldIpId the oldIpId to set
	 */
	public void setOldIpId(Integer oldIpId) {
		this.oldIpId = oldIpId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "IPRegisterDTO [ipId=" + ipId + ", patient=" + patient + ", treatment=" + treatment + ", room=" + room
				+ ", roomId=" + roomId + ", bedId=" + bedId + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", oldIpId=" + oldIpId + ", status=" + status + "]";
	}



}
