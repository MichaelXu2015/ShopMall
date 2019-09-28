package com.microservice.controller.product;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	 
	  @GetMapping("/getProduct/{productId}")
	  public ServerResponse findProductById(@PathVariable("productId") String productId) {
		  	Product product = productService.findProductById(productId);
		  	if(product!=null) {
		  		logger.info("========product======"+product.toString());
		  		return ServerResponse.createSuccess(product);
		  	}
			return ServerResponse.createFail();
	  }
	  
	  @PostMapping("/insertProduct")
	  public ServerResponse insertProduct(@RequestBody Product product) {
		  Integer  result = productService.insertProduct(product);
		  if(result>0) {
			  return ServerResponse.createSuccess();
		  }
		  return ServerResponse.createFail();
	  }
	  
	  
	  @PutMapping("/updateProduct")
	  public ServerResponse updateProduct(@RequestBody Product product) {
		  Integer  result =  productService.updateProduct(product);
		  if(result>0) {
			  return ServerResponse.createSuccess();
		  }
		  return ServerResponse.createFail();
	  }
	  
	  
	  @DeleteMapping("/deleteProductById/{productId}")
	  public ServerResponse deleteProductById(@PathVariable("productId") String productId) {
		  Integer  result =  productService.deleteProductById(productId);
		  if(result>0) {
			  return ServerResponse.createSuccess();
		  }
		  return ServerResponse.createFail();
	  }
	
	

}
