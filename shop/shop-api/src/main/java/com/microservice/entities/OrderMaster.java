package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单主单
 * @author qzy
 *
 */
public class OrderMaster {
	
	private Integer orderId;
	private String orderNo;
	private String userId;
	private String userName;
	private String fullName;
	private String phoneNumber;
	private String address;
	private BigDecimal total;
	private String expressNo;
	private String expressName;
	private Integer payType;
	private Integer status;
	private Date createTime;
	private Date updateTime;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getExpressNo() {
		return expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public String getExpressName() {
		return expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
		return "OrderMaster [orderId=" + orderId + ", orderNo=" + orderNo + ", userId=" + userId + ", userName="
				+ userName + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", total=" + total + ", expressNo=" + expressNo + ", expressName=" + expressName + ", payType="
				+ payType + ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	public OrderMaster() {
		super();
	}
	
	
	
	
	

}
