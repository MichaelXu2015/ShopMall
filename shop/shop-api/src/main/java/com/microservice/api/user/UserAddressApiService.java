package com.microservice.api.user;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.UserAddress;

@FeignClient(value="SHOP-USER",fallbackFactory=UserAddressApiServiceFallBack.class)
public interface UserAddressApiService {
	
	@PostMapping("/userAddress/insertUserAddress")
	Integer insertUserAddress(@RequestBody UserAddress userAddress);
	
	@DeleteMapping("/userAddress/deleteUserAddressByUserName/{userName}")
	 Integer deleteUserAddressByUserName(@PathVariable("userName")String userName);

	@PutMapping("/userAddress/updateUserAddress")
	Integer updateUserAddress(@RequestBody UserAddress userAddress);

	@GetMapping("/userAddress/findAllUserAddressByUserName/{userName}")
	List<UserAddress> findAllUserAddressByUserName(@PathVariable("userName")String userName);
}
