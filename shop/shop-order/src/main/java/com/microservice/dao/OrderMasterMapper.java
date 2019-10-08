package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.OrderMaster;

@Mapper
public interface OrderMasterMapper {
	
	 List<OrderMaster> findAllOrderMaster();
	 
	 OrderMaster findOrderMasterByOrderNo(String orderNo);
	 
	 List<OrderMaster> findOrderMasterByUserId(String userId);
	 
	 Integer updateOrderMasterByOrderId(OrderMaster orderMaster);
	 
	 Integer deleteOrderMasterByOrderId(Integer orderId);
	 
	 Integer insertOrderMaster(OrderMaster orderMaster);
	 
}
