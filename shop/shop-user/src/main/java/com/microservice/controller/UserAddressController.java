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

import com.microservice.entities.UserAddress;
import com.microservice.service.UserAddressService;

@RestController
@RequestMapping("/userAddress")
public class UserAddressController {

	@Autowired
	UserAddressService userAddressService;
	
	@PostMapping("/insertUserAddress")
	public Integer insertUserAddress(@RequestBody UserAddress userAddress) {
		return userAddressService.insertUserAddress(userAddress);
	}

	@DeleteMapping("/deleteUserAddressByUserName/{userName}")
	public Integer deleteUserAddressByUserName(@PathVariable("userName")String userName) {
		return userAddressService.deleteUserAddressByUserName(userName);
	}

	@PutMapping("/updateUserAddress")
	public Integer updateUserAddress(@RequestBody UserAddress userAddress) {
		return userAddressService.updateUserAddress(userAddress);
	}

	@GetMapping("/findAllUserAddressByUserName/{userName}")
	public List<UserAddress> findAllUserAddressByUserName(@PathVariable("userName")String userName) {
		return userAddressService.findAllUserAddressByUserName(userName);
	}

	
	
}
