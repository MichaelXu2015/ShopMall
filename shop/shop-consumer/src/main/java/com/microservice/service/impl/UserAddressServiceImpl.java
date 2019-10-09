package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.user.UserAddressApiService;
import com.microservice.entities.UserAddress;
import com.microservice.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressApiService userAddressApiService;
	
	@Override
	public Integer insertUserAddress(UserAddress userAddress) {
		return userAddressApiService.insertUserAddress(userAddress);
	}

	@Override
	public Integer deleteUserAddressByUserName(String userName) {
		return userAddressApiService.deleteUserAddressByUserName(userName);
	}

	@Override
	public Integer updateUserAddress(UserAddress userAddress) {
		return userAddressApiService.updateUserAddress(userAddress);
	}

	@Override
	public List<UserAddress> findAllUserAddressByUserName(String userName) {
		return userAddressApiService.findAllUserAddressByUserName(userName);
	}

}
