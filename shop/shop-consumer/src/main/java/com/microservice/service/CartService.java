package com.microservice.service;

import com.microservice.entities.Cart;

public interface CartService {
	
	 Cart findCartByUserId(String userId);
		
	 Integer insertCart(Cart cart);
		
	 Integer updateCartTotalPriceByCartId(String cartId, Float price);

}
