package com.microservice.controller.order;

import java.util.List;

import org.apache.log4j.Logger;
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
import com.microservice.common.ServerResponse;
import com.microservice.entities.OrderMaster;
import com.microservice.service.OrderMasterService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderMasterService orderMasterService;
	
	Logger logger = Logger.getLogger(getClass());
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findAllOrderMaster")
	public ServerResponse findAllOrderMaster() {
		List<OrderMaster> orderMasterList = orderMasterService.findAllOrderMaster();
		if(orderMasterList!=null && orderMasterList.size()!=0) {
			return ServerResponse.createSuccess(orderMasterList);
		}
		return ServerResponse.createFail("没有订单");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findOrderMasterByOrderNo/{orderNo}")
	public ServerResponse findOrderMasterByOrderNo(@PathVariable("orderNo") String orderNo) {
		OrderMaster orderMaster = orderMasterService.findOrderMasterByOrderNo(orderNo);
		if(orderMaster!=null) {
			return ServerResponse.createSuccess(orderMaster);
		}
		return ServerResponse.createFail("没有找到此 ["+orderNo+"] 订单");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findOrderMasterByUserId/{userId}")
	public ServerResponse findOrderMasterByUserId(@PathVariable("userId") String userId) {
		List<OrderMaster> orderMasterList = orderMasterService.findOrderMasterByUserId(userId);
		if(orderMasterList!=null &&orderMasterList.size()!=0) {
			return ServerResponse.createSuccess(orderMasterList);
		}
		return ServerResponse.createFail("没有找到此 ["+userId+"],用户id的订单");
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/updateOrderMasterByOrderId")
	public ServerResponse updateOrderMasterByOrderId(@RequestBody OrderMaster orderMaster) {
		Integer result = orderMasterService.updateOrderMasterByOrderId(orderMaster);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteOrderMasterByOrderId/{orderId}")
	public ServerResponse deleteOrderMasterByOrderId(@PathVariable("orderId") Integer orderId) {
		logger.info("orderId == "+orderId);
		Integer result = orderMasterService.deleteOrderMasterByOrderId(orderId);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertOrderMaster")
	public ServerResponse insertOrderMaster(@RequestBody OrderMaster orderMaster) {
		Integer result = orderMasterService.insertOrderMaster(orderMaster);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	

}
