package com.oncore.userservice.model;

public class Department {

	private Integer depId;
	
	private String departmentName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer depId, String departmentName) {
		super();
		this.depId = depId;
		this.departmentName = departmentName;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
