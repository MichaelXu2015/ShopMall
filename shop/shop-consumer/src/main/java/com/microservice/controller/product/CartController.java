package com.microservice.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.common.ServerResponse;
import com.microservice.entities.Cart;
import com.microservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;

	@SuppressWarnings("rawtypes")
	@GetMapping("/findCartByUserId/{userId}")
	public ServerResponse findCartByUserId(@PathVariable("userId")String userId) {
		Cart cart = cartService.findCartByUserId(userId);
		if(cart != null) {
			return ServerResponse.createSuccess(cart);
		}
		return ServerResponse.createFail("沒有找到 购物车");
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertCart")
	public ServerResponse insertCart(@RequestBody Cart cart) {
		Integer result = cartService.insertCart(cart);
		if(result >0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("增加购物车失败");
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/updateCartTotalPriceByUserId/{userId}/{price}")
	public ServerResponse updateCartTotalPriceByUserId(@PathVariable("userId")String userId,@PathVariable("price") Float price) {
		Integer result = cartService.updateCartTotalPriceByUserId(userId, price);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("更新购物车失败");
	}
}
