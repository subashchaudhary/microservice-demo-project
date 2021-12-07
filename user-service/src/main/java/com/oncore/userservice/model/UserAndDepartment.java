package com.oncore.userservice.model;

public class UserAndDepartment {

	private User userInfo;
	private Department departmentInfo;
	public UserAndDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAndDepartment(User userInfo, Department departmentInfo) {
		super();
		this.userInfo = userInfo;
		this.departmentInfo = departmentInfo;
	}
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	public Department getDepartmentInfo() {
		return departmentInfo;
	}
	public void setDepartmentInfo(Department departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	
	
}
