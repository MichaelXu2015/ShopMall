package com.microservice.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.entities.UserAccount;

public interface UserAccountService {
	
	UserAccount findUserAccountByUserNameAndPayPassword(String userName,String PayPassword);
	
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
	
	Integer updateUADeduction(String userName,Float money);
}
