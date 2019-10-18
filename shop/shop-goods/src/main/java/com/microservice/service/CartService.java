package com.microservice.service;

import org.apache.ibatis.annotations.Param;

import com.microservice.entities.Cart;

public interface CartService {
	
		public Cart findCartByUserId(String userId);
		
		public Integer insertCart(Cart cart);
		
		public Integer updateCartTotalPriceByUserId(String userId, Float price);

}
