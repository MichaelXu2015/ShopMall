package com.microservice.vo;

import java.util.List;
import com.microservice.entities.ProductCategory;


public class ChildProductCategoryVO {
	
	private String parentName;
	private Integer parentId;
	private String categoryCode;
	
	private List<ProductCategory> childCategoryList;
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public List<ProductCategory> getChildCategoryList() {
		return childCategoryList;
	}
	public void setChildCategoryList(List<ProductCategory> childCategoryList) {
		this.childCategoryList = childCategoryList;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	
	
	
	
	
}


	
	

