package com.microservice.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.common.ServerResponse;
import com.microservice.entities.CartDetail;
import com.microservice.service.CartDetailService;

@RestController
@RequestMapping("/cartDetail")
public class CartDetailController {
	
	@Autowired
	CartDetailService cartDetailService;
	
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findCartDetailByCartId/{cartId}")
	public ServerResponse findCartDetailByCartId(@PathVariable("cartId")String cartId) {
		List<CartDetail> list = cartDetailService.findCartDetailByCartId(cartId);
		if(list!=null && list.size()!=0) {
			return ServerResponse.createSuccess(list);
		}
		return ServerResponse.createFail("没有找到购物车详情");
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertCartDetail")
	public ServerResponse insertCartDetail(@RequestBody CartDetail cartDetail) {
		Integer result = cartDetailService.insertCartDetail(cartDetail);
		if(result >0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("增加购物车详情失败");
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteCartDetail/{cartDetailId}")
	public ServerResponse deleteCartDetail(@PathVariable("cartDetailId")String cartDetailId) {
		Integer result = cartDetailService.deleteCartDetail(cartDetailId);
		if(result >0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除购物车详情失败");
	}

}
