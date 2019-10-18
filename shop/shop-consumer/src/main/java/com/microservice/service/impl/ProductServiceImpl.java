package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.product.ProductApiService;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductApiService productApiService;

	@Override
	public Product findProductById(String productId) {
		return productApiService.findProductById(productId);
	}

	@Override
	public Integer insertProduct(Product product) {
		return productApiService.insertProduct(product);
	}

	@Override
	public Integer updateProduct(Product product) {
		return productApiService.updateProduct(product);
	}

	@Override
	public Integer deleteProductById(String productId) {
		return productApiService.deleteProductById(productId);
	}

	@Override
	public List<Product> findProductByCategoryCode(String categoryCode) {
		return productApiService.findProductByCategoryCode(categoryCode);
	}
	
	

}
