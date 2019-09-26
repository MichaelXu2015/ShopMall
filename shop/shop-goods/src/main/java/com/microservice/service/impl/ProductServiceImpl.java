package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.ProductMapper;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public Product findProductById(String productId) {
		
		return productMapper.findProductById(productId);
	}

	@Override
	public Integer insertProduct(Product product) {
		return productMapper.insertProduct(product);
	}

	@Override
	public Integer updateProduct(Product product) {
		return productMapper.updateProduct(product);
	}

	@Override
	public Integer deleteProductById(Integer productId) {
		return productMapper.deleteProductById(productId);
	}

}
