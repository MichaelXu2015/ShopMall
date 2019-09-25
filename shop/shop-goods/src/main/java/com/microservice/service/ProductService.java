package com.microservice.service;

import org.springframework.stereotype.Service;

import com.microservice.entities.Product;

public interface ProductService {
	
	Product findProductById(String productId);

}
