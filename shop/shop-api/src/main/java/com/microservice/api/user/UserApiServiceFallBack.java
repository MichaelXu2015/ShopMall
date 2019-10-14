package com.microservice.api.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.microservice.common.ErrorMessage;
import com.microservice.common.UserException;
import com.microservice.entities.User;
import feign.hystrix.FallbackFactory;

@Component
public class UserApiServiceFallBack implements FallbackFactory<UserApiService>{

	Logger logger = Logger.getLogger(getClass());
	
	@Override
	public UserApiService create(Throwable cause) {
		return new UserApiService() {
			
			@Override
			public Integer updateUser(User user) {
				throw new UserException(ErrorMessage.USER_UPDATE_FAIL);
			}
			
			@Override
			public Integer insertUser(User user) {
				throw new UserException(ErrorMessage.USER_REGISTER_FAIL);
			}
			
			@Override
			public User findUserByUserName(String userName) {
				throw new UserException(ErrorMessage.USER_LOGIN_FAIL);
			}
			
			@Override
			public List<User> findAllUser() {
				throw new UserException(ErrorMessage.USER_LOGIN_FAIL);
			}
			
			@Override
			public Integer deleteUserByUserName(String userName) {
				throw new UserException(ErrorMessage.USER_DELETE_FAIL);
			}

			@Override
			public User login(User user) {
				logger.error(" 登录发生错误了 ");
				throw new UserException(ErrorMessage.USER_LOGIN_FAIL);
			}

			@Override
			public User findUserByUserId(String userId) {
				throw new UserException(ErrorMessage.USER_FIND_FAIL);
			}

			@Override
			public User findUserByPhone(String phoneNumber) {
				throw new UserException(ErrorMessage.USER_FIND_FAIL);
			}
		};
	}

}
