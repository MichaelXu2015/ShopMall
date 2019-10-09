package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.ShopPayMapper;
import com.microservice.entities.PayOrder;
import com.microservice.service.ShopPayService;

@Service
public class ShopPayServiceImpl implements ShopPayService {

	@Autowired
	ShopPayMapper shopPayMapper;
	
	
	@Override
	public Integer insertShopPay(PayOrder payOrder) {
		return shopPayMapper.insertShopPay(payOrder);
	}

	@Override
	public PayOrder findPayOrderByPayOrderNo(String payOrderNo) {
		return shopPayMapper.findPayOrderByPayOrderNo(payOrderNo);
	}

	@Override
	public List<PayOrder> findPayOrderByUserName(String userName) {
		return shopPayMapper.findPayOrderByUserName(userName);
	}

	@Override
	public Integer deleteShopPayByOrderNo(String payOrderNo) {
		return shopPayMapper.deleteShopPayByOrderNo(payOrderNo);
	}

}
