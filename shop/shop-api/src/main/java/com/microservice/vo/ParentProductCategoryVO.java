package com.microservice.vo;

import java.util.List;
import com.microservice.entities.ProductCategory;


public class ParentProductCategoryVO {
	
	private ProductCategory rootProductCategoryInfo;
	private ChildProductCategoryVO childProductCategory;
	public ProductCategory getRootProductCategoryInfo() {
		return rootProductCategoryInfo;
	}
	public void setRootProductCategoryInfo(ProductCategory rootProductCategoryInfo) {
		this.rootProductCategoryInfo = rootProductCategoryInfo;
	}
	public ChildProductCategoryVO getChildProductCategory() {
		return childProductCategory;
	}
	public void setChildProductCategory(ChildProductCategoryVO childProductCategory) {
		this.childProductCategory = childProductCategory;
	}
	
	
	
	
	
	
	
	
}


	
	

