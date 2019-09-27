package com.microservice.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.ProductMapper;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;
	
	Logger logger = Logger.getLogger(getClass());

	@Override
	public Product findProductById(String productId) {
		Product product = productMapper.findProductById(productId);
		logger.info("------------xu-----------"+product);
		return product;
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
