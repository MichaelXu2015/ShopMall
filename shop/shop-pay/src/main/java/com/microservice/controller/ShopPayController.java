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

import com.microservice.entities.PayOrder;
import com.microservice.service.ShopPayService;
import com.microservice.util.RedisUtil;

@RestController
@RequestMapping("/pay")
public class ShopPayController {
	
	@Autowired
	ShopPayService shopPayService;
	

	
	@PostMapping("/insertShopPay")
	public Integer insertShopPay(@RequestBody PayOrder payOrder) {
		return shopPayService.insertShopPay(payOrder);
	}
	
	@GetMapping("/findPayOrderByPayOrderNo/{payOrderNo}")
	public PayOrder findPayOrderByPayOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		return shopPayService.findPayOrderByPayOrderNo(payOrderNo);
	}
	
	@GetMapping("/findPayOrderByUserName/{userName}")
	public List<PayOrder> findPayOrderByUserName(@PathVariable("userName")String userName){
		return shopPayService.findPayOrderByUserName(userName);
	}
	
	@DeleteMapping("/deleteShopPayByOrderNo/{payOrderNo}")
	public Integer deleteShopPayByOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		return shopPayService.deleteShopPayByOrderNo(payOrderNo);
	}
	
	

	
	

}
