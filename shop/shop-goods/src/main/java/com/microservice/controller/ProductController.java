package com.microservice.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	Logger logger = Logger.getLogger(getClass());
	
	@GetMapping("/getProduct/{productId}")
	public Product getProductById(@PathVariable("productId") String productId) {
		logger.info("getProductById:"+productId);
		return productService.findProductById(productId);
	}
	

}
