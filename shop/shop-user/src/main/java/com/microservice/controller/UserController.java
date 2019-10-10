package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.User;
import com.microservice.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/insertUser")
	@HystrixCommand
	public Integer insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}

	@GetMapping("/findAllUser")
	@HystrixCommand //加上此注解让hystrix监控调用情况
	public List<User> findAllUser() {
		return userService.findAllUser();
	}

	
	@GetMapping("/findUserByUserName/{userName}")
	@HystrixCommand
	public User findUserByUserName(@PathVariable("userName")String userName) {
		return userService.findUserByUserName(userName);
	}

	@PutMapping("/updateUser")
	@HystrixCommand
	public Integer updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/deleteUserByUserName/{userName}")
	@HystrixCommand
	public Integer deleteUserByUserName(@PathVariable("userName")String userName) {
		return userService.deleteUserByUserName(userName);
	}

}
