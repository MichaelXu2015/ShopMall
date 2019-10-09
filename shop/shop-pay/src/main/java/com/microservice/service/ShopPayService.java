package com.microservice.service;

import java.util.List;

import com.microservice.entities.PayOrder;

public interface ShopPayService {
	
	Integer insertShopPay(PayOrder payOrder);
	
	PayOrder findPayOrderByPayOrderNo(String payOrderNo);
	
	List<PayOrder> findPayOrderByUserName(String userName);
	
	Integer deleteShopPayByOrderNo(String payOrderNo);
}
