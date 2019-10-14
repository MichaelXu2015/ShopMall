package com.microservice.service;

import java.util.List;

import com.microservice.entities.ProductCategory;
import com.microservice.vo.ProductCategoryVO;

public interface ProductCategoryService {
	
	
	Integer deleteProductCategory(Integer categoryId);
	
	Integer insertProductCategory(ProductCategory productCategory);
	
	List<ProductCategory> findProductCategoryByParentId(Integer parentId);
	
	List<ProductCategory> findProductCategoryByCategoryId(Integer categoryId);
	
	Integer updateProductCategory(ProductCategory productCategory);
	
	ProductCategoryVO findProductCategoryInfo();
}
