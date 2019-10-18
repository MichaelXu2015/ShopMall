package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.OrderDetail;
import com.microservice.entities.OrderMaster;

@Mapper
public interface OrderDetailMapper {
	
	
	 //通过订单编号,查询订单详情
	 List<OrderDetail> findOrderDetailByOrderNo(String orderNo);
	 
	 //添加订单详情
	 Integer insertOrderDetail(OrderDetail orderDetail);
	 
	 
	 //根据订单详情ID删除订单详情
	 Integer deleteOrderDetailById(Integer orderDetailId);
	 
	 //根据订单编号删除订单详情
	 Integer deleteOrderDetailByOrderNo(String orderNo);
	 
	 
	 
	 
}
