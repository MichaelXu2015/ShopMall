package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.CartDetail;
import com.microservice.service.CartDetailService;

@RestController
@RequestMapping("/cartDetail")
public class CartDetailController {
	
	@Autowired
	CartDetailService cartDetailService;
	
	
	@GetMapping("/findCartDetailByCartId/{cartId}")
	public List<CartDetail> findCartDetailByCartId(@PathVariable("cartId")String cartId) {
		return cartDetailService.findCartDetailByCartId(cartId);
	}

	@PostMapping("/insertCartDetail")
	public Integer insertCartDetail(@RequestBody CartDetail cartDetail) {
		return cartDetailService.insertCartDetail(cartDetail);
	}

	@DeleteMapping("/deleteCartDetail/{cartDetailId}")
	public Integer deleteCartDetail(@PathVariable("cartDetailId")String cartDetailId) {
		return cartDetailService.deleteCartDetail(cartDetailId);
	}

}
