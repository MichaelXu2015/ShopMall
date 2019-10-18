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
	 public List<OrderMaster> findOrderMasterByUserId(@PathVariable("userId")String userId){
		 return masterService.findOrderMasterByUserId(userId);
	 }
	 
	 @PutMapping("/updateOrderMasterByOrderNo")
	 public Integer updateOrderMasterByOrderNo(@RequestBody OrderMaster orderMaster) {
		return masterService.updateOrderMasterByOrderNo(orderMaster);
	 }
	 
	 
	 @DeleteMapping("/deleteOrderMasterByOrderNo/{orderNo}")
	 public Integer deleteOrderMasterByOrderNo(@PathVariable("orderNo")String orderNo) {
		return masterService.deleteOrderMasterByOrderNo(orderNo);
		 
	 }
	 
	 @PostMapping("/insertOrderMaster")
	 public Integer insertOrderMaster(@RequestBody OrderMaster orderMaster) {
		 return masterService.insertOrderMaster(orderMaster);
	 }
	
}
