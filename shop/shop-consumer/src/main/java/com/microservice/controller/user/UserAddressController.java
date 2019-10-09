package com.microservice.controller.user;

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

import com.microservice.common.ServerResponse;
import com.microservice.entities.UserAddress;
import com.microservice.service.UserAddressService;

@RestController
@RequestMapping("/userAddress")
public class UserAddressController {
	
	@Autowired
	UserAddressService userAddressService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/insertUserAddress")
	public ServerResponse insertUserAddress(UserAddress userAddress) {
		Integer result = userAddressService.insertUserAddress(userAddress);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("增加用户地址信息失败!");
	}

	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteUserAddressByUserName/{userName}")
	public ServerResponse deleteUserAddressByUserName(@PathVariable("userName")String userName) {
		Integer result = userAddressService.deleteUserAddressByUserName(userName);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除用户地址信息失败!");
	}

	
	@SuppressWarnings("rawtypes")
	@PutMapping("/updateUserAddress")
	public ServerResponse updateUserAddress(@RequestBody UserAddress userAddress) {
		Integer result = userAddressService.updateUserAddress(userAddress);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("更新用户地址信息失败!");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findAllUserAddressByUserName/{userName}")
	public ServerResponse findAllUserAddressByUserName(@PathVariable("userName")String userName) {
		List<UserAddress> userAddresses = userAddressService.findAllUserAddressByUserName(userName);
		if(userAddresses!=null && userAddresses.size()!=0) {
			return ServerResponse.createSuccess(userAddresses);
		}
		return ServerResponse.createFail("未找到该["+userName+"]的地址信息");
	}


}
