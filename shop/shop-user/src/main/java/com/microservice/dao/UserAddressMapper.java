package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.UserAddress;

@Mapper
public interface UserAddressMapper {

	Integer insertUserAddress(UserAddress userAddress);
	
	Integer deleteUserAddressByUserName(String userName);
	
	Integer updateUserAddress(UserAddress userAddress);
	
	List<UserAddress> findAllUserAddressByUserName(String userName);
}
