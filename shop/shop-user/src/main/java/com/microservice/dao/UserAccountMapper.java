package com.microservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.entities.UserAccount;

@Mapper
public interface UserAccountMapper {
	
	
	UserAccount findUserAccountByUserNameAndPayPassword(@Param("userName")String userName,
			@Param("payPassword")String payPassword);
	
	Integer insertUserAccount(UserAccount userAccount);
	
	Integer deleteUserAccount(String userName);
	
	UserAccount findUserAccountByUserName(String userName);
	
	Integer updateUserAccountByUserName(UserAccount userAccount);
	
	//扣减余额,增加积分
	Integer updateUADeduction(@Param("userName")String userName,@Param("money")Float money);
}
