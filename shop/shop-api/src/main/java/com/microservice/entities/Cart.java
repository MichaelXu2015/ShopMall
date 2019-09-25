package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 购物车
 * @author qzy
 *
 */
public class Cart {
	
	private Integer cartId;
	private String userId;
	private String fullName;
	private BigDecimal totalPrice;
	private Date overdueTime;
	private Date createTime;
	private Date updateTime;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOverdueTime() {
		return overdueTime;
	}
	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
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
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", fullName=" + fullName + ", totalPrice=" + totalPrice
				+ ", overdueTime=" + overdueTime + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	

}
