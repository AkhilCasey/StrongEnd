package com.casey.bean;

import java.util.List;

/**
 * 
 * @author Akhil
 *
 */
public class DepartmentDTO {

	private Integer departmentId;
	private String departmentName;
	private String departmentDescription;
	private String departmentHead;
	private String departmentLocation;

	private List<DoctorDTO> departmentDoctor;

	/**
	 * @return the departmentId
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the departmentDescription
	 */
	public String getDepartmentDescription() {
		return departmentDescription;
	}

	/**
	 * @param departmentDescription the departmentDescription to set
	 */
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	/**
	 * @return the departmentHead
	 */
	public String getDepartmentHead() {
		return departmentHead;
	}

	/**
	 * @param departmentHead the departmentHead to set
	 */
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	/**
	 * @return the departmentLocation
	 */
	public String getDepartmentLocation() {
		return departmentLocation;
	}

	/**
	 * @param departmentLocation the departmentLocation to set
	 */
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	/**
	 * @return the departmentDoctor
	 */
	public List<DoctorDTO> getDepartmentDoctor() {
		return departmentDoctor;
	}

	/**
	 * @param departmentDoctor the departmentDoctor to set
	 */
	public void setDepartmentDoctor(List<DoctorDTO> departmentDoctor) {
		this.departmentDoctor = departmentDoctor;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentDescription=" + departmentDescription + ", departmentHead=" + departmentHead
				+ ", departmentLocation=" + departmentLocation + ", departmentDoctor=" + departmentDoctor + "]";
	}

}
