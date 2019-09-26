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


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	Logger logger = Logger.getLogger(getClass());
	
	@GetMapping("/getProduct/{productId}")
	public ServerResponse<Product> getProductById(@PathVariable("productId") String productId) {
		logger.info("getProductById:"+productId);
		Product product = productService.findProductById(productId);
		if(product!=null) {
			return ServerResponse.createSuccess(product);
		}
		return ServerResponse.createFail("没有查到此产品");
	}
	
	
	@PostMapping("/insertProduct")
	public ServerResponse insertProduct(@RequestBody Product product) {
		if(productService.insertProduct(product)>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	@PutMapping("/updateProduct")
	public ServerResponse updateProduct(@RequestBody Product product) {
		if(productService.updateProduct(product)>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	@DeleteMapping("/deleteProductById/{productId}")
	public ServerResponse deleteProductById(@PathVariable("productId") Integer productId) {
		Integer result = productService.deleteProductById(productId);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	
	

}
