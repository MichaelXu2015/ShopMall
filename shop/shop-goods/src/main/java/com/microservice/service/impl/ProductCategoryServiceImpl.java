package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.ProductCategoryMapper;
import com.microservice.entities.ProductCategory;
import com.microservice.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	
	@Autowired
	ProductCategoryMapper productCategoryMapper;
	

	@Override
	public Integer deleteProductCategory(Integer categoryId) {
		return productCategoryMapper.deleteProductCategory(categoryId);
	}

	@Override
	public Integer insertProductCategory(ProductCategory productCategory) {
		return productCategoryMapper.insertProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> findProductCategoryByParentId(Integer parentId) {
		return productCategoryMapper.findProductCategoryByParentId(parentId);
	}

	@Override
	public Integer updateProductCategory(ProductCategory productCategory) {
		return productCategoryMapper.updateProductCategory(productCategory);
	}

	

}
