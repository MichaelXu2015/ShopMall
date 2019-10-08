package com.microservice.api.order;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.microservice.entities.OrderMaster;
import com.microservice.entities.Product;

import feign.hystrix.FallbackFactory;

/**
  *  商品Api服务异常熔断处理,消费者请求服务提供者失败
 * @author qzy
 *
 */
@Component
public class OrderApiServiceFallBack implements FallbackFactory<OrderApiService> {

	 Logger logger = Logger.getLogger(getClass());

	@Override
	public OrderApiService create(Throwable cause) {
		return new OrderApiService() {
			
			@Override
			public Integer updateOrderMasterByOrderId(OrderMaster orderMaster) {
				return null;
			}
			
			@Override
			public Integer insertOrderMaster(OrderMaster orderMaster) {
				return null;
			}
			
			@Override
			public List<OrderMaster> findOrderMasterByUserId(String userId) {
				return null;
			}
			
			@Override
			public OrderMaster findOrderMasterByOrderNo(String orderNo) {
				return null;
			}
			
			@Override
			public List<OrderMaster> findAllOrderMaster() {
				return null;
			}
			
			@Override
			public Integer deleteOrderMasterByOrderId(Integer orderId) {
				return null;
			}
		};
	}
	
	
	
	
	
	

}
