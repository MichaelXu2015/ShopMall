package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户账户
 * @author qzy
 *
 */
public class UserAccount {
	
	private String userId;
	private String userName;
	private String fullName;
	private BigDecimal balance;
	private Integer integral;//积分
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
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
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
		return "UserAccount [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", balance="
				+ balance + ", integral=" + integral + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
	
	

}
