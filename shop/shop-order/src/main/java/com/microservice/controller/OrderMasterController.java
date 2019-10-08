package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.OrderMaster;
import com.microservice.service.OrderMasterService;

@RestController
@RequestMapping("/order")
public class OrderMasterController {

	
	@Autowired
	OrderMasterService masterService;
	
	
	 @GetMapping("/findAllOrderMaster")
	 public List<OrderMaster> findAllOrderMaster(){
		 return masterService.findAllOrderMaster();
	 }
	 
	 @GetMapping("/findOrderMasterByOrderNo/{orderNo}")
	 public OrderMaster findOrderMasterByOrderNo(@PathVariable("orderNo") String orderNo) {
		return masterService.findOrderMasterByOrderNo(orderNo);
	 }
	 
	 @GetMapping("/findOrderMasterByUserId/{userId}")
	 public List<OrderMaster> findOrderMasterByUserId(String userId){
		 return masterService.findOrderMasterByUserId(userId);
	 }
	 
	 @PutMapping("/updateOrderMasterByOrderId")
	 public Integer updateOrderMasterByOrderId(@RequestBody OrderMaster orderMaster) {
		return masterService.updateOrderMasterByOrderId(orderMaster);
	 }
	 
	 
	 @DeleteMapping("/deleteOrderMasterByOrderId/{orderId}")
	 public Integer deleteOrderMasterByOrderId(@PathVariable("orderId")Integer orderId) {
		return masterService.deleteOrderMasterByOrderId(orderId);
		 
	 }
	 
	 @PostMapping("/insertOrderMaster")
	 public Integer insertOrderMaster(@RequestBody OrderMaster orderMaster) {
		 return masterService.insertOrderMaster(orderMaster);
	 }
	
}
