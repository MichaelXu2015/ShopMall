package com.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.dao.UserAccountMapper;
import com.microservice.entities.UserAccount;
import com.microservice.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService{
	
	@Autowired
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

	@Override
	public UserAccount findUserAccountByUserNameAndPayPassword(String userName, String payPassword) {
		return userAccountMapper.findUserAccountByUserNameAndPayPassword(userName, payPassword);
	}

	@Override
	public Integer updateUADeduction(String userName, Float money) {
		return userAccountMapper.updateUADeduction(userName, money);
	}

	

	
	

}
