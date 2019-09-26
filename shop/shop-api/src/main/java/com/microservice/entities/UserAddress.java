package com.microservice.entities;

import java.util.Date;
/**
 * 用户地址
 * @author qzy
 *
 */
public class UserAddress {

	private String userId;
	private String userName;
	private String fullName;
	private String phoneNumber;
	private String province;
	private String city;
	private String area;
	private String detailAddr;
	private Date createTime;
	private Date updateTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "UserAddress [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", phoneNumber="
				+ phoneNumber + ", province=" + province + ", city=" + city + ", area=" + area + ", detailAddr="
				+ detailAddr + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
