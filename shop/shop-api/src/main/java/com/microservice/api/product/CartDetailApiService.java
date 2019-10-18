package com.microservice.api.product;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.CartDetail;

@FeignClient(value="SHOP-PRODUCT",fallbackFactory=CartDetailApiServiceFallBack.class)
public interface CartDetailApiService {

	@GetMapping("/cartDetail/findCartDetailByCartId/{cartId}")
	public List<CartDetail> findCartDetailByCartId(@PathVariable("cartId")String cartId);

	@PostMapping("/cartDetail/insertCartDetail")
	public Integer insertCartDetail(@RequestBody CartDetail cartDetail);
	
	@DeleteMapping("/cartDetail/deleteCartDetail/{cartDetailId}")
	public Integer deleteCartDetail(@PathVariable("cartDetailId")String cartDetailId);

}
