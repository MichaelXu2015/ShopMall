package com.microservice.api.product;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.microservice.entities.CartDetail;
import feign.hystrix.FallbackFactory;

@Component
public class CartDetailApiServiceFallBack implements FallbackFactory<CartDetailApiService> {

	@Override
	public CartDetailApiService create(Throwable cause) {
		return new CartDetailApiService() {
			
			@Override
			public Integer insertCartDetail(CartDetail cartDetail) {
				return null;
			}
			
			@Override
			public List<CartDetail> findCartDetailByCartId(String cartId) {
				return null;
			}
			
			@Override
			public Integer deleteCartDetail(String cartDetailId) {
				return null;
			}
		};
	}

}
