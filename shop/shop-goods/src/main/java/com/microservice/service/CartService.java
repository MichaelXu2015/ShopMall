package com.microservice.service;

import com.microservice.entities.Cart;

public interface CartService {
	
		public Cart findCartByUserId(String userId);
		
		public Integer insertCart(Cart cart);
		
		public Integer updateCartTotalPriceByCartId(String cartId, Float price);

}
