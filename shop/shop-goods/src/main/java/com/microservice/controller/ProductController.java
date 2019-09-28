package com.microservice.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.common.ServerResponse;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;

/**
 * 服务提供者返回的数据不要封装成响应类型，让消费者端去封装
 * @author qzy
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	Logger logger = Logger.getLogger(getClass());
	
	@GetMapping("/getProduct/{productId}")
	public Product getProductById(@PathVariable("productId") String productId) {
		logger.info("getProductById:"+productId);
		Product product = productService.findProductById(productId);
		return product;

	}
	
	
	@PostMapping("/insertProduct")
	public Integer insertProduct(@RequestBody Product product) {
		return productService.insertProduct(product);
	
	}
	
	@PutMapping("/updateProduct")
	public Integer updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
		
	}
	
	@DeleteMapping("/deleteProductById/{productId}")
	public Integer deleteProductById(@PathVariable("productId") String productId) {
		return productService.deleteProductById(productId);
	}
	
	
	

}
