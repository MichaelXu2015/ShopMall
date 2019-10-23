package com.microservice.controller;

import org.apache.log4j.Logger;
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
	
	
	Logger logger = Logger.getLogger(getClass());
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@PostMapping("/insertUserAccount")
	public Integer insertUserAccount(@RequestBody UserAccount userAccount) {
		return userAccountService.insertUserAccount(userAccount);
	}

	@DeleteMapping("/deleteUserAccount/{userName}")
	public Integer deleteUserAccount(@PathVariable("userName") String userName) {
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
	
	@GetMapping("/findUAByUnamePsd/{userName}/{payPass}")
	public UserAccount findUAByUnamePsd(@PathVariable("userName")String userName, @PathVariable("payPass")String payPass) {
		logger.info("------------userName == "+userName+" -----------password == "+payPass);
		return userAccountService.findUserAccountByUserNameAndPayPassword(userName, payPass);
	}
	
	@GetMapping("/updateUADeduction/{userName}/{money}")
	public Integer updateUADeduction(@PathVariable("userName")String userName, @PathVariable("money")Float money) {
		return userAccountService.updateUADeduction(userName, money);
	}
}
