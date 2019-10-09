package com.microservice.api.pay;

import java.util.List;

import org.springframework.stereotype.Component;

import com.microservice.entities.PayOrder;

import feign.hystrix.FallbackFactory;

@Component
public class PayApiServiceFallBack implements FallbackFactory<PayApiService> {

	@Override
	public PayApiService create(Throwable cause) {
		return new PayApiService() {
			
			@Override
			public Integer insertShopPay(PayOrder payOrder) {
				return null;
			}
			
			@Override
			public List<PayOrder> findPayOrderByUserName(String userName) {
				return null;
			}
			
			@Override
			public PayOrder findPayOrderByPayOrderNo(String payOrderNo) {
				return null;
			}
			
			@Override
			public Integer deleteShopPayByOrderNo(String payOrderNo) {
				return null;
			}
		};
	}

}
