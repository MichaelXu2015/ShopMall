package com.microservice.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.microservice.entities.UserAccount;

public interface UserAccountService {
	
	UserAccount findUserAccountByUserNameAndPayPassword(String userName,String PayPassword);
	
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
}
