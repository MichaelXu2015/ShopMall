package com.microservice.service;

import java.util.List;

import com.microservice.entities.OrderDetail;

public interface OrderDetailService {
	 List<OrderDetail> findOrderDetailByOrderNo(String orderNo);
	 
	 Integer insertOrderDetail(OrderDetail orderDetail);
	 
	 Integer deleteOrderDetailById(Integer orderDetailId);
	 
	 Integer deleteOrderDetailByOrderNo(String orderNo);
}
