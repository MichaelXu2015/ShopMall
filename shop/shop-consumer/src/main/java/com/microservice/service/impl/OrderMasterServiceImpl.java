package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.order.OrderApiService;
import com.microservice.entities.OrderMaster;
import com.microservice.service.OrderMasterService;

@Service
public class OrderMasterServiceImpl implements OrderMasterService {

	@Autowired
	OrderApiService orderApiService;
	
	@Override
	public List<OrderMaster> findAllOrderMaster() {
		return orderApiService.findAllOrderMaster();
	}

	@Override
	public OrderMaster findOrderMasterByOrderNo(String orderNo) {
		return orderApiService.findOrderMasterByOrderNo(orderNo);
	}

	@Override
	public List<OrderMaster> findOrderMasterByUserId(String userId) {
		return orderApiService.findOrderMasterByUserId(userId);
	}

	@Override
	public Integer updateOrderMasterByOrderId(OrderMaster orderMaster) {
		return orderApiService.updateOrderMasterByOrderId(orderMaster);
	}

	@Override
	public Integer deleteOrderMasterByOrderId(Integer orderId) {
		return orderApiService.deleteOrderMasterByOrderId(orderId);
	}

	@Override
	public Integer insertOrderMaster(OrderMaster orderMaster) {
		return orderApiService.insertOrderMaster(orderMaster);
	}

}
