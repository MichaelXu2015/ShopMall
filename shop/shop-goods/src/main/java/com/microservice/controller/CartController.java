package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.Cart;
import com.microservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;

	@GetMapping("/findCartByUserId/{userId}")
	public Cart findCartByUserId(@PathVariable("userId")String userId) {
		return cartService.findCartByUserId(userId);
	}

	@PostMapping("/insertCart")
	public Integer insertCart(@RequestBody Cart cart) {
		return cartService.insertCart(cart);
	}

	@PutMapping("/updateCartTotalPriceByUserId/{userId}/{price}")
	public Integer updateCartTotalPriceByUserId(@PathVariable("userId")String userId,@PathVariable("price") Float price) {
		return cartService.updateCartTotalPriceByUserId(userId, price);
	}
}
