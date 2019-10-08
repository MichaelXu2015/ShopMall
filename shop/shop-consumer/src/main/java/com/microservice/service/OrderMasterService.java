package com.microservice.service;

import java.util.List;

import com.microservice.entities.OrderMaster;

public interface OrderMasterService {
	 List<OrderMaster> findAllOrderMaster();
	 
	 OrderMaster findOrderMasterByOrderNo(String orderNo);
	 
	 List<OrderMaster> findOrderMasterByUserId(String userId);
	 
	 Integer updateOrderMasterByOrderId(OrderMaster orderMaster);
	 
	 Integer deleteOrderMasterByOrderId(Integer orderId);
	 
	 Integer insertOrderMaster(OrderMaster orderMaster);
}
