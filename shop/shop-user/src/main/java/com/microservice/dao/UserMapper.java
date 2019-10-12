package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.User;

@Mapper
public interface UserMapper {

	Integer insertUser(User user);
	
	User login(User user);
	
	User findUserByUserId(String userId);
	
	User findUserByPhone(String phoneNumber);
	
	List<User> findAllUser();
	
	User findUserByUserName(String userName);
	
	Integer updateUser(User user);
	
	Integer deleteUserByUserName(String userName);
	
	
}
