package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.user.UserApiService;
import com.microservice.entities.User;
import com.microservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserApiService userApiService;

	@Override
	public Integer insertUser(User user) {
		return userApiService.insertUser(user);
	}

	@Override
	public List<User> findAllUser() {
		return userApiService.findAllUser();
	}

	@Override
	public User findUserByUserName(String userName) {
		return userApiService.findUserByUserName(userName);
	}

	@Override
	public Integer updateUser(User user) {
		return userApiService.updateUser(user);
	}

	@Override
	public Integer deleteUserByUserName(String userName) {
		return userApiService.deleteUserByUserName(userName);
	}

}
