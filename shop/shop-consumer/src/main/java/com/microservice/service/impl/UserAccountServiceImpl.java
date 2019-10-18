package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.api.user.UserAccountApiService;
import com.microservice.entities.UserAccount;
import com.microservice.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService{
	
	@Autowired
	UserAccountApiService userAccountApiService;

	@Override
	public Integer insertUserAccount(UserAccount userAccount) {
		return userAccountApiService.insertUserAccount(userAccount);
	}

	@Override
	public Integer deleteUserAccount(String userName) {
		return userAccountApiService.deleteUserAccount(userName);
	}

	@Override
	public UserAccount findUserAccountByUserName(String userName) {
		return userAccountApiService.findUserAccountByUserName(userName);
	}

	@Override
	public Integer updateUserAccountByUserName(UserAccount userAccount) {
		return userAccountApiService.updateUserAccountByUserName(userAccount);
	}

	@Override
	public UserAccount findUserAccountByUserNameAndPayPassword(String userName, String PayPassword) {
		return userAccountApiService.findUAByUnamePsd(userName, PayPassword);
	}

}
