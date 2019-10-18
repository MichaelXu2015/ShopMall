package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.product.CartDetailApiService;
import com.microservice.entities.CartDetail;
import com.microservice.service.CartDetailService;

@Service
public class CartDetailServiceImpl implements CartDetailService{
	
	@Autowired
	CartDetailApiService cartDetailApiService;

	@Override
	public List<CartDetail> findCartDetailByCartId(String cartId) {
		return cartDetailApiService.findCartDetailByCartId(cartId);
	}

	@Override
	public Integer insertCartDetail(CartDetail cartDetail) {
		return cartDetailApiService.insertCartDetail(cartDetail);
	}

	@Override
	public Integer deleteCartDetail(String cartDetailId) {
		return cartDetailApiService.deleteCartDetail(cartDetailId);
	}

}
