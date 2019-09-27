package com.microservice.service;

import com.microservice.entities.Product;

public interface ProductService {
	
	Product findProductById(String productId);

}
