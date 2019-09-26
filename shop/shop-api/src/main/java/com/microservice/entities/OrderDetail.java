package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情
 * @author qzy
 *
 */
public class OrderDetail {
	
	private Integer orderDetailId;
	private String orderNo;
	private String productId;
	private String productName;
	private BigDecimal price;
	private Integer quantity;
	private BigDecimal total;
	private Date createTime;
	private Date updateTime;
	public Integer getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
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
		return "OrderDetail [orderDetailId=" + orderDetailId + ", orderNo=" + orderNo + ", productId=" + productId
				+ ", productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", total=" + total
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	

}
