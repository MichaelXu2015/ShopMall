package com.microservice.api.order;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservice.entities.OrderMaster;

@FeignClient(value="SHOP-ORDER",fallbackFactory=OrderApiServiceFallBack.class)
public interface OrderApiService {
	
	 @GetMapping("/order/findAllOrderMaster")
	 List<OrderMaster> findAllOrderMaster();
	 	 
	 @GetMapping("/order/findOrderMasterByOrderNo/{orderNo}")
	 OrderMaster findOrderMasterByOrderNo(@PathVariable("orderNo") String orderNo);
	 
	 @GetMapping("/order/findOrderMasterByUserId/{userId}")
	 List<OrderMaster> findOrderMasterByUserId(@PathVariable("userId")String userId);
	 
	 @PutMapping("/order/updateOrderMasterByOrderId")
	 Integer updateOrderMasterByOrderId(@RequestBody OrderMaster orderMaster);
	 
	 @DeleteMapping("/order/deleteOrderMasterByOrderId/{orderId}")
	 Integer deleteOrderMasterByOrderId(@PathVariable("orderId") Integer orderId);
	 
	 @PostMapping("/order/insertOrderMaster")
	 Integer insertOrderMaster(@RequestBody OrderMaster orderMaster);
}
