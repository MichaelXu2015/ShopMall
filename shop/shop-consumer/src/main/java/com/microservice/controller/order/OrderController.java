package com.microservice.controller.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.api.order.OrderApiService;
import com.microservice.entities.OrderMaster;
import com.microservice.service.OrderMasterService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderMasterService orderMasterService;
	
	@GetMapping("/findAllOrderMaster")
	public List<OrderMaster> findAllOrderMaster() {
		return orderMasterService.findAllOrderMaster();
	}

	@GetMapping("/findOrderMasterByOrderNo/{orderNo}")
	public OrderMaster findOrderMasterByOrderNo(@PathVariable("orderNo") String orderNo) {
		return orderMasterService.findOrderMasterByOrderNo(orderNo);
	}

	@GetMapping("/findOrderMasterByUserId/{userId}")
	public List<OrderMaster> findOrderMasterByUserId(@PathVariable("userId") String userId) {
		return orderMasterService.findOrderMasterByUserId(userId);
	}

	@PutMapping("/updateOrderMasterByOrderId")
	public Integer updateOrderMasterByOrderId(@RequestBody OrderMaster orderMaster) {
		return orderMasterService.updateOrderMasterByOrderId(orderMaster);
	}

	@DeleteMapping("/deleteOrderMasterByOrderId/{orderId}")
	public Integer deleteOrderMasterByOrderId(@PathVariable("orderId") Integer orderId) {
		return orderMasterService.deleteOrderMasterByOrderId(orderId);
	}

	@PostMapping("/insertOrderMaster")
	public Integer insertOrderMaster(@RequestBody OrderMaster orderMaster) {
		return orderMasterService.insertOrderMaster(orderMaster);
	}

}
