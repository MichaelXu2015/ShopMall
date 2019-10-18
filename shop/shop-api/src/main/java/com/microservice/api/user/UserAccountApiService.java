package com.microservice.api.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.UserAccount;

@FeignClient(value="SHOP-USER",fallbackFactory=UserAccountApiServiceFallBack.class)
public interface UserAccountApiService {
	
	@PostMapping("/userAccount/insertUserAccount")
	Integer insertUserAccount(@RequestBody UserAccount userAccount);

	@DeleteMapping("/userAccount/deleteUserAccount/{userName}")
	Integer deleteUserAccount(@PathVariable("userName") String userName);

	@GetMapping("/userAccount/findUserAccountByUserName/{userName}")
	UserAccount findUserAccountByUserName(@PathVariable("userName")String userName);

	@PutMapping("/userAccount/updateUserAccountByUserName")
	Integer updateUserAccountByUserName(@RequestBody UserAccount userAccount);
	
	@GetMapping("/userAccount/findUAByUnamePsd/{userName}/{payPass}")
	public UserAccount findUAByUnamePsd(@PathVariable("userName")String userName, @PathVariable("payPass")String payPass);

}
