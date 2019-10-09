package com.microservice.controller.user;

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

import com.microservice.common.ServerResponse;
import com.microservice.entities.User;
import com.microservice.service.UserService;

/**
 * 用户api接口
 * @author qzy
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertUser")
	public ServerResponse insertUser(@RequestBody User user) {
		Integer result = userService.insertUser(user);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("新增用户失败!");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findAllUser")
	public ServerResponse findAllUser() {
		List<User> userList = userService.findAllUser();
		if(userList!=null && userList.size()!=0) {
			return ServerResponse.createSuccess(userList);
		}
		return ServerResponse.createFail("未找到用户!");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findUserByUserName/{userName}")
	public ServerResponse findUserByUserName(@PathVariable("userName") String userName) {
		User user = userService.findUserByUserName(userName);
		if(user!=null) {
			return ServerResponse.createSuccess(user);
		}
		return ServerResponse.createFail("未找到["+userName+"]该用户的信息!");
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/updateUser")
	public ServerResponse updateUser(@RequestBody User user) {
		Integer result = userService.updateUser(user);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("修改用户信息失败!");
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteUserByUserName/{userName}")
	public ServerResponse deleteUserByUserName(@PathVariable("userName")String userName) {
		Integer result = userService.deleteUserByUserName(userName);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除用户信息失败!");
	
	}

}
