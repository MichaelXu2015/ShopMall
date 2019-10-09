package com.microservice.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.api.user.UserAccountApiService;
import com.microservice.common.ServerResponse;
import com.microservice.entities.UserAccount;

/**
 * 用户账户api接口
 * @author qzy
 *
 */
@RestController
@RequestMapping("/userAccount")
public class UserAccountController {
	
	@Autowired
	UserAccountApiService userAccountApiService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/insertUserAccount")
	public ServerResponse insertUserAccount(@RequestBody UserAccount userAccount) {
		Integer result = userAccountApiService.insertUserAccount(userAccount);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("添加用户失败");
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteUserAccount/{userName}")
	public ServerResponse deleteUserAccount(@PathVariable("userName") String userName) {
		Integer result = userAccountApiService.deleteUserAccount(userName);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除用户失败");

	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findUserAccountByUserName/{userName}")
	public ServerResponse findUserAccountByUserName(@PathVariable("userName") String userName) {
		UserAccount userAccount = userAccountApiService.findUserAccountByUserName(userName);
		if(userAccount!=null) {
			return ServerResponse.createSuccess(userAccount);
		}
		return ServerResponse.createFail("未找到["+userName+"]的账户信息"); 
	}

	
	@SuppressWarnings("rawtypes")
	@PutMapping("/updateUserAccountByUserName")
	public ServerResponse updateUserAccountByUserName(@RequestBody UserAccount userAccount) {
		Integer result = userAccountApiService.updateUserAccountByUserName(userAccount);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("修改["+userAccount.getUserName()+"]用户信息失败");
	}


}
