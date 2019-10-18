package com.microservice.service;

import java.util.List;

import com.microservice.entities.OrderMaster;

public interface OrderMasterService {
	 
	 List<OrderMaster> findAllOrderMaster();
	 
	 OrderMaster findOrderMasterByOrderNo(String orderNo);
	 
	 List<OrderMaster> findOrderMasterByUserId(String userId);
	 
	 Integer updateOrderMasterByOrderNo(OrderMaster orderMaster);
	 
	 Integer deleteOrderMasterByOrderNo(String orderNo);
	 
	 Integer insertOrderMaster(OrderMaster orderMaster);
}
