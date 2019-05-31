/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.bean;

import java.sql.Date;

/**
 * 
 * @author Akhil
 *
 */
public class PharmacyMedicineDTO {

	private String medicineName;
	private String category;
	private String supplierName;
	private String uom;
	private String medCode;
	private String batchCode;
	private Integer quantity;
	private Integer stockId;
	private float totalAmount;
	private float rate;
	private Date expiryDate;
	private Date manufactureDate;

	/**
	 * @return the medicineName
	 */
	public String getMedicineName() {
		return medicineName;
	}

	/**
	 * @param medicineName the medicineName to set
	 */
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @return the uom
	 */
	public String getUom() {
		return uom;
	}

	/**
	 * @param uom the uom to set
	 */
	public void setUom(String uom) {
		this.uom = uom;
	}

	/**
	 * @return the medCode
	 */
	public String getMedCode() {
		return medCode;
	}

	/**
	 * @param medCode the medCode to set
	 */
	public void setMedCode(String medCode) {
		this.medCode = medCode;
	}

	/**
	 * @return the batchCode
	 */
	public String getBatchCode() {
		return batchCode;
	}

	/**
	 * @param batchCode the batchCode to set
	 */
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the stockId
	 */
	public Integer getStockId() {
		return stockId;
	}

	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the totalAmount
	 */
	public float getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the manufactureDate
	 */
	public Date getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * @param manufactureDate the manufactureDate to set
	 */
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "PharmacyMedicine [medicineName=" + medicineName + ", category=" + category + ", supplierName="
				+ supplierName + ", uom=" + uom + ", medCode=" + medCode + ", batchCode=" + batchCode + ", quantity="
				+ quantity + ", stockId=" + stockId + ", totalAmount=" + totalAmount + ", rate=" + rate
				+ ", expiryDate=" + expiryDate + ", manufactureDate=" + manufactureDate + "]";
	}

}
