package com.microservice.controller.product;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.api.product.ProductApiService;
import com.microservice.common.ServerResponse;
import com.microservice.entities.Product;
import com.microservice.service.ProductService;


/**
 * 注意消费者在调用服务提供者时,返回值必须保持一样的,不然消费者调用服务提供者时会为null
 * @author qzy
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	  @Autowired 
	  ProductService productService;
	  
	  Logger logger = Logger.getLogger(getClass());
	 
	  @RequestMapping(value = "/getProduct/{productId}")
	  public ServerResponse findProductById(@PathVariable("productId") String productId) {
		  	Product product = productService.findProductById(productId);
		  	if(product!=null) {
		  		logger.info("========product======"+product.toString());
		  		return ServerResponse.createSuccess(product);
		  	}
			return ServerResponse.createFail();
	  }
	
	/*
	 * @GetMapping("/getProduct/{productId}") public ServerResponse
	 * findProductById(@PathVariable("productId") String productId) {
	 * logger.info("findProductById:"+productId); Product product =
	 * productApiService.findProductById(productId);
	 * logger.info("product--------------"+product.toString()); if(product!=null) {
	 * return ServerResponse.createSuccess(product); } return
	 * ServerResponse.createFail("获取失败"); }
	 */
	 

}
