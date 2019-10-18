package com.microservice.service;

import java.util.List;

import com.microservice.entities.Product;

public interface ProductService {
	
	Product findProductById(String productId);
	
	Integer insertProduct(Product product);
	
	Integer updateProduct(Product product);
	
	Integer deleteProductById(String productId);
	
	List<Product> findProductByCategoryCode(String categoryCode);

}
