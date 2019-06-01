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
public class TreatmentDTO {
    private Integer treatementid;
    private String treatementType;
    private float amount;
	/**
	 * @return the treatementid
	 */
	public Integer getTreatementid() {
		return treatementid;
	}
	/**
	 * @param treatementid the treatementid to set
	 */
	public void setTreatementid(Integer treatementid) {
		this.treatementid = treatementid;
	}
	/**
	 * @return the treatementType
	 */
	public String getTreatementType() {
		return treatementType;
	}
	/**
	 * @param treatementType the treatementType to set
	 */
	public void setTreatementType(String treatementType) {
		this.treatementType = treatementType;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TreatementDTO [treatementid=" + treatementid + ", treatementType=" + treatementType + ", amount="
				+ amount + "]";
	}

   
    
    
    
    
    
    
    
}
