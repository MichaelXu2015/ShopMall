package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.pay.PayApiService;
import com.microservice.entities.PayOrder;
import com.microservice.service.PayOrderService;


@Service
public class PayOrderServiceImpl implements PayOrderService {
	
	@Autowired
	PayApiService payApiService;
	

	@Override
	public Integer insertShopPay(PayOrder payOrder) {
		return payApiService.insertShopPay(payOrder);
	}

	@Override
	public PayOrder findPayOrderByPayOrderNo(String payOrderNo) {
		return payApiService.findPayOrderByPayOrderNo(payOrderNo);
	}

	@Override
	public List<PayOrder> findPayOrderByUserName(String userName) {
		return payApiService.findPayOrderByUserName(userName);
	}

	@Override
	public Integer deleteShopPayByOrderNo(String payOrderNo) {
		return payApiService.deleteShopPayByOrderNo(payOrderNo);
	}

}
