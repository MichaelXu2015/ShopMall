package com.microservice.service;

import java.util.List;

import com.microservice.entities.CartDetail;

public interface CartDetailService {
	
	public List<CartDetail> findCartDetailByCartId(String cartId);
		
	public Integer insertCartDetail(CartDetail cartDetail);
		
	public Integer deleteCartDetail(String cartDetailId);
}
