package com.microservice.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
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
		//int a = 1/0; 此处若抛出异常,则会被消费者端的ProductApiServiceFallBack捕获
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
	public Integer deleteProductById(String productId) {
		return productMapper.deleteProductById(productId);
	}

	@Override
	public List<Product> findProductByCategoryCode(String categoryCode) {
		return productMapper.findProductByCategoryCode(categoryCode);
	}

	@Override
	public Integer updateProductStock(String productId, Integer stock) {
		return productMapper.updateProductStock(productId, stock);
	}


	

}
