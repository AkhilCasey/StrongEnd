package com.casey.bean;

import java.util.Date;

/**
 * 
 * @author Akhil
 *
 */
public class RoomDTO {
	private Integer roomId;
	private String roomName;
	private float roomPerDayPrice;
	private Date roomCheckinDate;
	private Date roomCheckoutDate;
	private String status;
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
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	/**
	 * @return the roomPerDayPrice
	 */
	public float getRoomPerDayPrice() {
		return roomPerDayPrice;
	}
	/**
	 * @param roomPerDayPrice the roomPerDayPrice to set
	 */
	public void setRoomPerDayPrice(float roomPerDayPrice) {
		this.roomPerDayPrice = roomPerDayPrice;
	}
	/**
	 * @return the roomCheckinDate
	 */
	public Date getRoomCheckinDate() {
		return roomCheckinDate;
	}
	/**
	 * @param roomCheckinDate the roomCheckinDate to set
	 */
	public void setRoomCheckinDate(Date roomCheckinDate) {
		this.roomCheckinDate = roomCheckinDate;
	}
	/**
	 * @return the roomCheckoutDate
	 */
	public Date getRoomCheckoutDate() {
		return roomCheckoutDate;
	}
	/**
	 * @param roomCheckoutDate the roomCheckoutDate to set
	 */
	public void setRoomCheckoutDate(Date roomCheckoutDate) {
		this.roomCheckoutDate = roomCheckoutDate;
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
		return "RoomDTO [roomId=" + roomId + ", roomName=" + roomName + ", roomPerDayPrice=" + roomPerDayPrice
				+ ", roomCheckinDate=" + roomCheckinDate + ", roomCheckoutDate=" + roomCheckoutDate + ", status="
				+ status + "]";
	}
	
	
}
