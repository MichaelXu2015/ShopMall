package com.microservice.service;

import java.util.List;

import com.microservice.entities.UserAddress;

public interface UserAddressService {
	Integer insertUserAddress(UserAddress userAddress);

	Integer deleteUserAddressByUserName(String userName);

	Integer updateUserAddress(UserAddress userAddress);

	List<UserAddress> findAllUserAddressByUserName(String userName);
}
