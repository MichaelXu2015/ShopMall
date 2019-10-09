package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.dao.UserAddressMapper;
import com.microservice.entities.UserAddress;
import com.microservice.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {
	
	
	@Autowired
	UserAddressMapper userAddressMapper;

	@Override
	public Integer insertUserAddress(UserAddress userAddress) {
		return userAddressMapper.insertUserAddress(userAddress);
	}

	@Override
	public Integer deleteUserAddressByUserName(String userName) {
		return userAddressMapper.deleteUserAddressByUserName(userName);
	}

	@Override
	public Integer updateUserAddress(UserAddress userAddress) {
		return userAddressMapper.updateUserAddress(userAddress);
	}

	@Override
	public List<UserAddress> findAllUserAddressByUserName(String userName) {
		return userAddressMapper.findAllUserAddressByUserName(userName);
	}

	
	
	
	

}
