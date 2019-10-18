package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.CartDetailMapper;
import com.microservice.entities.CartDetail;
import com.microservice.service.CartDetailService;

@Service
public class CartDetailServiceImpl implements CartDetailService {
	
	@Autowired
	CartDetailMapper cartDetailMapper;

	@Override
	public List<CartDetail> findCartDetailByCartId(String cartId) {
		return cartDetailMapper.findCartDetailByCartId(cartId);
	}

	@Override
	public Integer insertCartDetail(CartDetail cartDetail) {
		return cartDetailMapper.insertCartDetail(cartDetail);
	}

	@Override
	public Integer deleteCartDetail(String cartDetailId) {
		return cartDetailMapper.deleteCartDetail(cartDetailId);
	}

}
