package com.microservice.entities;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 商品
 * @author qzy
 *
 */
public class Product {
	
	private String productId;
	private String productName;
	private String categoryCode;
	private BigDecimal price;
	private String descript;
	private Integer productStatus;
	private String productImg;
	private Integer stock;
	private Integer categoryId;
	private String categoryName;
	private String brandId;
	private String brandName;
	private Date createTime;
	private Date updateTime;
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public Integer getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
		return "Product [productId=" + productId + ", productName=" + productName + ", categoryCode=" + categoryCode
				+ ", price=" + price + ", descript=" + descript + ", productStatus=" + productStatus + ", productImg="
				+ productImg + ", stock=" + stock + ", categoryId=" + categoryId + ", categoryName=" + categoryName
				+ ", brandId=" + brandId + ", brandName=" + brandName + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	
	

}
