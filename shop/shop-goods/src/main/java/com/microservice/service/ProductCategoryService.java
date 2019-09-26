package com.microservice.service;

import java.util.List;

import com.microservice.entities.ProductCategory;

public interface ProductCategoryService {
	
	
	Integer deleteProductCategory(Integer categoryId);
	
	Integer insertProductCategory(ProductCategory productCategory);
	
	List<ProductCategory> findProductCategoryByParentId(Integer parentId);
	
	Integer updateProductCategory(ProductCategory productCategory);
}
