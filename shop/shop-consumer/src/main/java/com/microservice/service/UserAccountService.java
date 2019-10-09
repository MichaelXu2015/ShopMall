package com.microservice.service;

import java.util.List;

import com.microservice.entities.UserAccount;

public interface UserAccountService {
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
}
