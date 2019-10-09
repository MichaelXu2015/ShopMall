package com.microservice.service;

import java.util.List;

import com.microservice.entities.PayOrder;

public interface PayOrderService {
	
	Integer insertShopPay(PayOrder payOrder);
	
	PayOrder findPayOrderByPayOrderNo(String payOrderNo);
	
	List<PayOrder> findPayOrderByUserName(String userName);
	
	Integer deleteShopPayByOrderNo(String payOrderNo);
	

}
