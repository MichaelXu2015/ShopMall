package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.PayOrder;

@Mapper
public interface ShopPayMapper {

	
	Integer insertShopPay(PayOrder payOrder);
	
	PayOrder findPayOrderByPayOrderNo(String payOrderNo);
	
	List<PayOrder> findPayOrderByUserName(String userName);
	
	Integer deleteShopPayByOrderNo(String payOrderNo);
	
}
