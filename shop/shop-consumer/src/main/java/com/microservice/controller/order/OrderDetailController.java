package com.microservice.controller.order;

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
import com.microservice.entities.OrderDetail;
import com.microservice.service.OrderDetailService;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
	
	@Autowired
	OrderDetailService orderDetailService;
	
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findOrderDetailByOrderNo/{orderNo}")
	public ServerResponse findOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo) {
		List<OrderDetail> list = orderDetailService.findOrderDetailByOrderNo(orderNo);
		if(list!=null && list.size()!=0) {
			return ServerResponse.createSuccess(list);
		}
		return ServerResponse.createFail("查询订单详情失败");
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertOrderDetail")
	public ServerResponse insertOrderDetail(@RequestBody OrderDetail orderDetail) {
		Integer result = orderDetailService.insertOrderDetail(orderDetail);
		if(result>0) {
			return ServerResponse.createSuccess("增加订单详情成功");
		}
		return ServerResponse.createFail("增加订单详情失败");
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteOrderDetailById/{orderDetailId}")
	public ServerResponse deleteOrderDetailById(@PathVariable("orderDetailId")Integer orderDetailId) {
		Integer result = orderDetailService.deleteOrderDetailById(orderDetailId);
		if(result>0) {
			return ServerResponse.createSuccess("删除订单详情成功");
		}
		return ServerResponse.createFail("删除订单详情失败");
	
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteOrderDetailByOrderNo/{orderNo}")
	public ServerResponse deleteOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo) {
		Integer result = orderDetailService.deleteOrderDetailByOrderNo(orderNo);
		if(result>0) {
			return ServerResponse.createSuccess("删除订单详情成功");
		}
		return ServerResponse.createFail("删除订单详情失败");
	}

}
