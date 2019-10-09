package com.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dao.UserAccountMapper;
import com.microservice.entities.UserAccount;
import com.microservice.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService{
	
	UserAccountMapper userAccountMapper;

	@Override
	public Integer insertUserAccount(UserAccount userAccount) {
		return userAccountMapper.insertUserAccount(userAccount);
	}

	@Override
	public Integer deleteUserAccount(String userName) {
		return userAccountMapper.deleteUserAccount(userName);
	}

	@Override
	public UserAccount findUserAccountByUserName(String userName) {
		return userAccountMapper.findUserAccountByUserName(userName);
	}

	@Override
	public Integer updateUserAccountByUserName(UserAccount userAccount) {
		return userAccountMapper.updateUserAccountByUserName(userAccount);
	}

	
	

}
