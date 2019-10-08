package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.OrderMasterMapper;
import com.microservice.entities.OrderMaster;
import com.microservice.service.OrderMasterService;

@Service
public class OrderMasterServiceImpl implements OrderMasterService {

	@Autowired
	OrderMasterMapper orderMasterMapper;
	
	
	@Override
	public List<OrderMaster> findAllOrderMaster() {
		return orderMasterMapper.findAllOrderMaster();
	}

	@Override
	public OrderMaster findOrderMasterByOrderNo(String orderNo) {
		return orderMasterMapper.findOrderMasterByOrderNo(orderNo);
	}

	@Override
	public List<OrderMaster> findOrderMasterByUserId(String userId) {
		return orderMasterMapper.findOrderMasterByUserId(userId);
	}

	@Override
	public Integer updateOrderMasterByOrderId(OrderMaster orderMaster) {
		return orderMasterMapper.updateOrderMasterByOrderId(orderMaster);
	}

	@Override
	public Integer deleteOrderMasterByOrderId(Integer orderId) {
		return orderMasterMapper.deleteOrderMasterByOrderId(orderId);
	}

	@Override
	public Integer insertOrderMaster(OrderMaster orderMaster) {
		return orderMasterMapper.insertOrderMaster(orderMaster);
	}

}
