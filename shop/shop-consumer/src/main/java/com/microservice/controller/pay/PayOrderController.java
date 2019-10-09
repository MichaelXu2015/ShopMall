package com.microservice.controller.pay;

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
import com.microservice.service.PayOrderService;

@RestController
@RequestMapping("/pay")
public class PayOrderController {
	
	@Autowired
	PayOrderService payOrderService;
	
	@PostMapping("/insertShopPay")
	public Integer insertShopPay(@RequestBody PayOrder payOrder) {
		return payOrderService.insertShopPay(payOrder);
	}
	
	@GetMapping("/findPayOrderByPayOrderNo/{payOrderNo}")
	public PayOrder findPayOrderByPayOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		return payOrderService.findPayOrderByPayOrderNo(payOrderNo);
	}
	
	@GetMapping("/findPayOrderByUserName/{userName}")
	public List<PayOrder> findPayOrderByUserName(@PathVariable("userName")String userName){
		return payOrderService.findPayOrderByUserName(userName);
	}
	
	@DeleteMapping("/deleteShopPayByOrderNo/{payOrderNo}")
	public Integer deleteShopPayByOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		return payOrderService.deleteShopPayByOrderNo(payOrderNo);
	}


}
