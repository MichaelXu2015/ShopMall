package com.microservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.microservice.entities.Cart;

@Mapper
public interface CartMapper {
	
	
	//根据userId查询购物车
	public Cart findCartByUserId(String cartId);
	
	public Integer insertCart(Cart cart);
	
	//更改购物车的总金额
	public Integer updateCartTotalPriceByUserId(@Param("cartId")String cartId,@Param("price") Float price);
	
}
