package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.CartMapper;
import com.microservice.entities.Cart;
import com.microservice.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartMapper cartMapper;

	@Override
	public Cart findCartByUserId(String userId) {
		return cartMapper.findCartByUserId(userId);
	}

	@Override
	public Integer insertCart(Cart cart) {
		return cartMapper.insertCart(cart);
	}

	@Override
	public Integer updateCartTotalPriceByUserId(String userId, Float price) {
		return cartMapper.updateCartTotalPriceByUserId(userId, price);
	}

}
