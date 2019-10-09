package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entities.UserAccount;
import com.microservice.service.UserAccountService;

@RestController
@RequestMapping("/userAccount")
public class UserAccountController {

	@Autowired
	UserAccountService userAccountService;
	
	@PostMapping("/insertUserAccount")
	public Integer insertUserAccount(@RequestBody UserAccount userAccount) {
		return userAccountService.insertUserAccount(userAccount);
	}

	@DeleteMapping("/deleteUserAccount/{userName}")
	public Integer deleteUserAccount(@PathVariable String userName) {
		return userAccountService.deleteUserAccount(userName);
	}

	@GetMapping("/findUserAccountByUserName/{userName}")
	public UserAccount findUserAccountByUserName(@PathVariable("userName")String userName) {
		return userAccountService.findUserAccountByUserName(userName);
	}

	@PutMapping("/updateUserAccountByUserName")
	public Integer updateUserAccountByUserName(@RequestBody UserAccount userAccount) {
		return userAccountService.updateUserAccountByUserName(userAccount);
	}
}
