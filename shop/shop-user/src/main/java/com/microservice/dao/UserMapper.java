package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.User;

@Mapper
public interface UserMapper {

	Integer insertUser(User user);
	
	List<User> findAllUser();
	
	User findUserByUserName(String userName);
	
	Integer updateUser(User user);
	
	Integer deleteUserByUserName(String userName);
	
	
}
