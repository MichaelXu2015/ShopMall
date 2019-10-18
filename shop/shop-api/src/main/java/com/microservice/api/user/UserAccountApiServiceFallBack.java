package com.microservice.api.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.microservice.entities.User;
import com.microservice.entities.UserAccount;

import feign.hystrix.FallbackFactory;

@SuppressWarnings("unused")
@Component
public class UserAccountApiServiceFallBack implements FallbackFactory<UserAccountApiService>{

	@Override
	public UserAccountApiService create(Throwable cause) {
		return new UserAccountApiService() {
			
			@Override
			public Integer updateUserAccountByUserName(UserAccount userAccount) {
				return null;
			}
			
			@Override
			public Integer insertUserAccount(UserAccount userAccount) {
				return null;
			}
			
			@Override
			public UserAccount findUserAccountByUserName(String userName) {
				return null;
			}
			
			@Override
			public Integer deleteUserAccount(String userName) {
				return null;
			}

			@Override
			public UserAccount findUAByUnamePsd(String userName, String payPass) {
				return null;
			}
		};
	}

	

}
