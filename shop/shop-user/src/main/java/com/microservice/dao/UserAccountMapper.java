package com.microservice.dao;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.UserAccount;

@Mapper
public interface UserAccountMapper {
	
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
}
