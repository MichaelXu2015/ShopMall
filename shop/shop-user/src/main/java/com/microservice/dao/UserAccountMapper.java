package com.microservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.microservice.entities.UserAccount;

@Mapper
public interface UserAccountMapper {
	
	
	UserAccount findUserAccountByUserNameAndPayPassword(@Param("userName")String userName,
			@Param("payPassword")String payPassword);
	
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
}
