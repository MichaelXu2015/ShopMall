package com.microservice.api.user;

import java.util.List;
import org.springframework.stereotype.Component;
import com.microservice.entities.User;
import feign.hystrix.FallbackFactory;

@Component
public class UserApiServiceFallBack implements FallbackFactory<UserApiService>{

	@Override
	public UserApiService create(Throwable cause) {
		return new UserApiService() {
			
			@Override
			public Integer updateUser(User user) {
				return null;
			}
			
			@Override
			public Integer insertUser(User user) {
				return null;
			}
			
			@Override
			public User findUserByUserName(String userName) {
				return null;
			}
			
			@Override
			public List<User> findAllUser() {
				return null;
			}
			
			@Override
			public Integer deleteUserByUserName(String userName) {
				return null;
			}

			@Override
			public User login(User user) {
				return null;
			}

			@Override
			public User findUserByUserId(String userId) {
				return null;
			}

			@Override
			public User findUserByPhone(String phoneNumber) {
				return null;
			}
		};
	}

}
