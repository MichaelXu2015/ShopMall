package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.OrderDetailMapper;
import com.microservice.entities.OrderDetail;
import com.microservice.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	OrderDetailMapper orderDetailMapper;
	
	@Override
	public List<OrderDetail> findOrderDetailByOrderNo(String orderNo) {
		return orderDetailMapper.findOrderDetailByOrderNo(orderNo);
	}

	@Override
	public Integer insertOrderDetail(OrderDetail orderDetail) {
		return orderDetailMapper.insertOrderDetail(orderDetail);
	}

	@Override
	public Integer deleteOrderDetailById(Integer orderDetailId) {
		return orderDetailMapper.deleteOrderDetailById(orderDetailId);
	}

	@Override
	public Integer deleteOrderDetailByOrderNo(String orderNo) {
		return orderDetailMapper.deleteOrderDetailByOrderNo(orderNo);
	}

}
