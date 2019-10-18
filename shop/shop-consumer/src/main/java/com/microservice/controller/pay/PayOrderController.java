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

import com.microservice.common.ServerResponse;
import com.microservice.entities.PayOrder;
import com.microservice.service.PayOrderService;

@RestController
@RequestMapping("/pay")
public class PayOrderController {
	
	@Autowired
	PayOrderService payOrderService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/insertShopPay")
	public ServerResponse insertShopPay(@RequestBody PayOrder payOrder) {
		Integer result = payOrderService.insertShopPay(payOrder);
		if(result >0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("添加支付订单失败");
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findPayOrderByPayOrderNo/{payOrderNo}")
	public ServerResponse findPayOrderByPayOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		PayOrder payOrder = payOrderService.findPayOrderByPayOrderNo(payOrderNo);
		if(payOrder!=null) {
			return ServerResponse.createSuccess(payOrder);
		}
		return ServerResponse.createFail("查询支付订单失败");
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findPayOrderByUserName/{userName}")
	public ServerResponse  findPayOrderByUserName(@PathVariable("userName")String userName){
		List<PayOrder> list = payOrderService.findPayOrderByUserName(userName);
		if(list!=null && list.size()!=0) {
			return ServerResponse.createSuccess(list);
		}
		return ServerResponse.createFail("查询支付订单失败");
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteShopPayByOrderNo/{payOrderNo}")
	public ServerResponse deleteShopPayByOrderNo(@PathVariable("payOrderNo")String payOrderNo) {
		Integer result = payOrderService.deleteShopPayByOrderNo(payOrderNo);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除支付订单失败");
				
	}


}
