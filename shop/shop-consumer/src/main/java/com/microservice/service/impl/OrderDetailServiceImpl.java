package com.microservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.api.order.OrderDetailApiService;
import com.microservice.entities.OrderDetail;
import com.microservice.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	
	OrderDetailApiService orderDetailApiService;

	@Override
	public List<OrderDetail> findOrderDetailByOrderNo(String orderNo) {
		return orderDetailApiService.findOrderDetailByOrderNo(orderNo);
	}

	@Override
	public Integer insertOrderDetail(OrderDetail orderDetail) {
		return orderDetailApiService.insertOrderDetail(orderDetail);
	}

	@Override
	public Integer deleteOrderDetailById(Integer orderDetailId) {
		return orderDetailApiService.deleteOrderDetailById(orderDetailId);
	}

	@Override
	public Integer deleteOrderDetailByOrderNo(String orderNo) {
		return orderDetailApiService.deleteOrderDetailByOrderNo(orderNo);
	}

}
