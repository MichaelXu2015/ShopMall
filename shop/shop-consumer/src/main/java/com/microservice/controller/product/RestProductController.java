package com.microservice.controller.product;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.entities.Product;

@RestController
@RequestMapping("/restProduct")
public class RestProductController {

	// 消费者通过服务提供者的微服务名称来访问服务提供者
	private static final String REST_URL_PREFIX = "http://SHOP-PRODUCT";

	Logger logger = Logger.getLogger(getClass());
	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/product/getProduct/{productId}")
	public Product getProductById(@PathVariable("productId") String productId) {
		logger.info("---------------getProductById----------------");
		return restTemplate.getForObject(REST_URL_PREFIX + "/product/getProduct/" + productId, Product.class);
	}

}
