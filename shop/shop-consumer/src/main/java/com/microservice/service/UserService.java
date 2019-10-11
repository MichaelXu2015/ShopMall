package com.microservice.service;

import java.util.List;

import com.microservice.entities.User;

public interface UserService {
	
	Integer insertUser(User user);

	List<User> findAllUser();
	
	User login(User user);

	User findUserByUserName(String userName);

	Integer updateUser(User user);

	Integer deleteUserByUserName(String userName);
}
