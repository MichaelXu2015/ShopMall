package com.microservice.api.product;

import org.springframework.stereotype.Component;

import com.microservice.entities.Cart;

import feign.hystrix.FallbackFactory;

@Component
public class CartApiServiceFallBack implements FallbackFactory<CartApiService> {

	@Override
	public CartApiService create(Throwable cause) {
		return new CartApiService() {
			
			@Override
			public Integer updateCartTotalPriceByUserId(String userId, Float price) {
				return null;
			}
			
			@Override
			public Integer insertCart(Cart cart) {
				return null;
			}
			
			@Override
			public Cart findCartByUserId(String userId) {
				return null;
			}
		};
	}

}
