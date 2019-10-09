package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付单
 * @author qzy
 *
 */
public class PayOrder {
	
	private Integer payOrderId;
	private String payOrderNo;
	private String userName;
	private String fullName;
	private Integer payType;
	private String orderNo;
	private BigDecimal amount;
	private Date createTime;
	private Date updateTime;
	public Integer getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(Integer payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
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
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
		return "PayOrder [payOrderId=" + payOrderId + ", payOrderNo=" + payOrderNo + ", userName=" + userName
				+ ", fullName=" + fullName + ", payType=" + payType + ", orderNo=" + orderNo + ", amount=" + amount
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	

}
