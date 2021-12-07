package com.oncore.userservice.model;

public class User {

	private Integer userId;
	private String name;
	private String address;
	private Integer depId;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public User(Integer userId, String name, String address, Integer depId) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.depId = depId;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	
	
}
