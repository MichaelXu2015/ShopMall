package com.microservice.api.product;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.microservice.entities.Product;

import feign.hystrix.FallbackFactory;

/**
  *   商品Api服务异常熔断处理,消费者请求服务提供者失败
 * @author qzy
 *
 */
@Component
public class ProductApiServiceFallBack implements FallbackFactory<ProductApiService> {

	 Logger logger = Logger.getLogger(getClass());
	
	
	@Override
	public ProductApiService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new ProductApiService() {
			
			@Override
			public Integer updateProduct(Product product) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer insertProduct(Product product) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Product findProductById(String productId) {
				logger.info("findProductById222222222222222222:"+productId);
				Product product = new Product();
				product.setProductId(productId);
				product.setCategoryName("没有获取到数据:"+productId);
				return product;
			}
			
			@Override
			public Integer deleteProductById(Integer productId) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	
	
	

}
