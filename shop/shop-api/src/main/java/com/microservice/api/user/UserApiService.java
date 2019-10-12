package com.microservice.api.user;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.User;

@FeignClient(value="SHOP-USER",fallbackFactory=UserApiServiceFallBack.class)
public interface UserApiService {

	
	@PostMapping("/user/insertUser")
	Integer insertUser(@RequestBody User user);

	@GetMapping("/user/findAllUser")
	List<User> findAllUser() ;
	
	@PostMapping("/user/login")
	User login(@RequestBody User user);
	
	@GetMapping("/user/findUserByUserId/{userId}")
	User findUserByUserId(@PathVariable("userId")String userId);
	
	@GetMapping("/user/findUserByPhone/{phoneNumber}")
	User findUserByPhone(@PathVariable("phoneNumber")String phoneNumber);

	
	@GetMapping("/user/findUserByUserName/{userName}")
	User findUserByUserName(@PathVariable("userName")String userName);


	@PutMapping("/user/updateUser")
	Integer updateUser(@RequestBody User user);

	@DeleteMapping("/user/deleteUserByUserName/{userName}")
	Integer deleteUserByUserName(@PathVariable("userName")String userName);

}
