package com.microservice.api.pay;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.PayOrder;

@FeignClient(value="SHOP-PAY",fallbackFactory=PayApiServiceFallBack.class)
public interface PayApiService {
	

	@PostMapping("/pay/insertShopPay")
	Integer insertShopPay(@RequestBody PayOrder payOrder);
	
	@GetMapping("/pay/findPayOrderByPayOrderNo/{payOrderNo}")
	PayOrder findPayOrderByPayOrderNo(@PathVariable("payOrderNo")String payOrderNo);
	
	@GetMapping("/pay/findPayOrderByUserName/{userName}")
	List<PayOrder> findPayOrderByUserName(@PathVariable("userName")String userName);
	
	@DeleteMapping("/pay/deleteShopPayByOrderNo/{payOrderNo}")
	Integer deleteShopPayByOrderNo(@PathVariable("payOrderNo")String payOrderNo);

}
