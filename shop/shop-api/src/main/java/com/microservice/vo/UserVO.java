package com.microservice.vo;

public class UserVO {
	
	private String userName;
	private String userId;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String token;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", userId=" + userId + ", fullName=" + fullName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", token=" + token + "]";
	}
	
	
	


	

}
