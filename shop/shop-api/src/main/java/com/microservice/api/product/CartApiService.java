package com.microservice.api.product;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.microservice.entities.Cart;

@FeignClient(value="SHOP-PRODUCT",fallbackFactory=CartApiServiceFallBack.class)
public interface CartApiService {
	
	@GetMapping("/cart/findCartByUserId/{userId}")
	public Cart findCartByUserId(@PathVariable("userId")String userId);

	@PostMapping("/cart/insertCart")
	public Integer insertCart(@RequestBody Cart cart);

	@PutMapping("/cart/updateCartTotalPriceByUserId/{userId}/{price}")
	public Integer updateCartTotalPriceByUserId(@PathVariable("userId")String userId,@PathVariable("price") Float price) ;
}
