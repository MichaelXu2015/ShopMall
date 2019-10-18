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

import com.microservice.entities.OrderDetail;
import com.microservice.service.OrderDetailService;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
	
	@Autowired
	OrderDetailService orderDetailService;
	
	
	@GetMapping("/findOrderDetailByOrderNo/{orderNo}")
	public List<OrderDetail> findOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo) {
		return orderDetailService.findOrderDetailByOrderNo(orderNo);
	}

	@PostMapping("/insertOrderDetail")
	public Integer insertOrderDetail(@RequestBody OrderDetail orderDetail) {
		return orderDetailService.insertOrderDetail(orderDetail);
	}

	@DeleteMapping("/deleteOrderDetailById/{orderDetailId}")
	public Integer deleteOrderDetailById(@PathVariable("orderDetailId")Integer orderDetailId) {
		return orderDetailService.deleteOrderDetailById(orderDetailId);
	}

	@DeleteMapping("/deleteOrderDetailByOrderNo/{orderNo}")
	public Integer deleteOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo) {
		return orderDetailService.deleteOrderDetailByOrderNo(orderNo);
	}

}
