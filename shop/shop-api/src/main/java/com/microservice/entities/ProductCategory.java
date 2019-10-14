package com.microservice.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 商品类别
 * @author qzy
 *
 */
public class ProductCategory {

	private Integer categoryId;
	private String categoryName;
	private String categoryCode;
	private Integer parentId;
	
	//使用Jackson配置过滤字段,使其在返回json字符串时,不显示该数据
	@JsonIgnore
	private Date createTime;
	
	@JsonIgnore
	private Date updateTime;
	
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryCode="
				+ categoryCode + ", parentId=" + parentId + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
}
