package com.microservice.api.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.microservice.entities.UserAddress;
import feign.hystrix.FallbackFactory;

@Component
public class UserAddressApiServiceFallBack implements FallbackFactory<UserAddressApiService>{

	@Override
	public UserAddressApiService create(Throwable cause) {
		return new UserAddressApiService() {
			
			@Override
			public Integer updateUserAddress(UserAddress userAddress) {
				return null;
			}
			
			@Override
			public Integer insertUserAddress(UserAddress userAddress) {
				return null;
			}
			
			@Override
			public List<UserAddress> findAllUserAddressByUserName(String userName) {
				return null;
			}
			
			@Override
			public Integer deleteUserAddressByUserName(String userName) {
				return null;
			}
		};
	}

}
