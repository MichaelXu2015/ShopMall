package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 购物车详情
 * @author qzy
 *
 */
public class CartDetail {

	private String cartId;
	//购物车详情ID
	private String cartDetailId;
	private String productId;
	private String productName;
	private BigDecimal productPrice;
	private Integer quantity;
	private BigDecimal subtotal;
	
	@JsonIgnore
	private Date createTime;
	
	@JsonIgnore
	private Date updateTime;
	
	public String getCartDetailId() {
		return cartDetailId;
	}
	public void setCartDetailId(String cartDetailId) {
		this.cartDetailId = cartDetailId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
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
		return "CartDetail [cartId=" + cartId + ", cartDetailId=" + cartDetailId + ", productId=" + productId
				+ ", productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity
				+ ", subtotal=" + subtotal + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	
	
	
	
}
