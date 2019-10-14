package com.microservice.api.product;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.Product;

/**
   *    消费者通过Feign的方式消费服务者提供的服务
 * value = 指向服务提供者的微服务名称,见服务提供者shop-goods模块的yml文件里 
 * spring:
  	application:
    	name: shop-goods #eureka显示的微服务名字
 * @author qzy
 *
 */
@FeignClient(value="SHOP-PRODUCT2",fallbackFactory=ProductApiServiceFallBack.class)
public interface ProductApiService {
	
	@GetMapping("/product/getProduct/{productId}")
	Product findProductById(@PathVariable("productId") String productId);
	
	
	@PostMapping("/product/insertProduct")
	Integer insertProduct(@RequestBody Product product);
	
	@PutMapping("/product/updateProduct")
	Integer updateProduct(@RequestBody Product product);
	
	@DeleteMapping("/product/deleteProductById/{productId}")
	Integer deleteProductById(@PathVariable("productId") String productId);
}
