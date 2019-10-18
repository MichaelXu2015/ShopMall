package com.microservice.api.order;

import java.util.List;
import org.springframework.stereotype.Service;
import com.microservice.entities.OrderDetail;
import feign.hystrix.FallbackFactory;

@Service
public class OrderDetailApiServiceFallBack implements FallbackFactory<OrderDetailApiService> {

	@Override
	public OrderDetailApiService create(Throwable cause) {
		return new OrderDetailApiService() {
			
			@Override
			public Integer insertOrderDetail(OrderDetail orderDetail) {
				return null;
			}
			
			@Override
			public List<OrderDetail> findOrderDetailByOrderNo(String orderNo) {
				return null;
			}
			
			@Override
			public Integer deleteOrderDetailByOrderNo(String orderNo) {
				return null;
			}
			
			@Override
			public Integer deleteOrderDetailById(Integer orderDetailId) {
				return null;
			}
		};
	}

}
