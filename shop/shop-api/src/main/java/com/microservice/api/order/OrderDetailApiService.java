package com.microservice.api.order;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.OrderDetail;

@FeignClient(value="SHOP-ORDER",fallbackFactory=OrderDetailApiServiceFallBack.class)
public interface OrderDetailApiService {

	@GetMapping("/orderDetail/findOrderDetailByOrderNo/{orderNo}")
	public List<OrderDetail> findOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo);

	@PostMapping("/orderDetail/insertOrderDetail")
	public Integer insertOrderDetail(@RequestBody OrderDetail orderDetail);

	@DeleteMapping("/orderDetail/deleteOrderDetailById/{orderDetailId}")
	public Integer deleteOrderDetailById(@PathVariable("orderDetailId")Integer orderDetailId);

	@DeleteMapping("/orderDetail/deleteOrderDetailByOrderNo/{orderNo}")
	public Integer deleteOrderDetailByOrderNo(@PathVariable("orderNo")String orderNo);
}
