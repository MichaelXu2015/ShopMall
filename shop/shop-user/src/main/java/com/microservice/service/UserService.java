package com.microservice.service;

import java.util.List;

import com.microservice.entities.User;

public interface UserService {
	
	Integer insertUser(User user);

	User login(User user);
	
	List<User> findAllUser();

	User findUserByUserId(String userId);
	
	User findUserByPhone(String phoneNumber);
	
	User findUserByUserName(String userName);

	Integer updateUser(User user);

	Integer deleteUserByUserName(String userName);
}
