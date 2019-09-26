package com.microservice.service;

import com.microservice.entities.Product;

public interface ProductService {
	
	Product findProductById(String productId);
	
	Integer insertProduct(Product product);
	
	Integer updateProduct(Product product);
	
	Integer deleteProductById(Integer productId);

}
