package com.casey.utils;

import java.util.List;

import org.springframework.http.HttpStatus;

public class StatusResponse<T> {

	
	private HttpStatus statusCode;
	private HttpStatus errorcode;
	private String message;
	private List<T> data;
	
	/**
	 * @return the statusCode
	 */
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the errorcode
	 */
	public HttpStatus getErrorcode() {
		return errorcode;
	}
	/**
	 * @param errorcode the errorcode to set
	 */
	public void setErrorcode(HttpStatus errorcode) {
		this.errorcode = errorcode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}
	public StatusResponse(HttpStatus ok, HttpStatus ok2, String message, List<T> data) {
		super();
		this.statusCode = ok;
		this.errorcode = ok2;
		this.message = message;
		this.data = data;
	}

	
	
	
}
