package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.OrderMaster;

@Mapper
public interface OrderMasterMapper {
	
	 //查询所有的订单
	 List<OrderMaster> findAllOrderMaster();
	 
	 //根据订单编号查询订单
	 OrderMaster findOrderMasterByOrderNo(String orderNo);
	 
	 //根据用户ID查询订单
	 List<OrderMaster> findOrderMasterByUserId(String userId);
	 
	 
	 //根据订单编号更新订单信息
	 Integer updateOrderMasterByOrderNo(OrderMaster orderMaster);
	 
	 //根据订单编号删除订单
	 Integer deleteOrderMasterByOrderNo(String orderNo);
	 
	 //增加订单
	 Integer insertOrderMaster(OrderMaster orderMaster);
	 
}
