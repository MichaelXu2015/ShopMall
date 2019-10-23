package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.product.CartApiService;
import com.microservice.entities.Cart;
import com.microservice.service.CartService;


@Service
public class CartServiceImpl implements CartService {
	
	
	@Autowired
	CartApiService cartApiService;

	@Override
	public Cart findCartByUserId(String userId) {
		return cartApiService.findCartByUserId(userId);
	}

	@Override
	public Integer insertCart(Cart cart) {
		return cartApiService.insertCart(cart);
	}

	@Override
	public Integer updateCartTotalPriceByCartId(String cartId, Float price) {
		return cartApiService.updateCartTotalPriceByCartId(cartId, price);
	}

}
