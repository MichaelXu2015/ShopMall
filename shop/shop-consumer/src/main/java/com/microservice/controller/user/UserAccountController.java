package com.microservice.controller.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.common.ServerResponse;
import com.microservice.entities.OrderDetail;
import com.microservice.entities.UserAccount;
import com.microservice.service.OrderDetailService;
import com.microservice.service.ProductService;
import com.microservice.service.UserAccountService;

/**
 * 用户账户api接口
 * 
 * @author qzy
 *
 */
@RestController
@RequestMapping("/userAccount")
public class UserAccountController {

	@Autowired
	UserAccountService userAccountService;

	@Autowired
	ProductService productService;

	@Autowired
	OrderDetailService orderDetailService;
	
	Logger logger = Logger.getLogger(getClass());

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertUserAccount")
	public ServerResponse insertUserAccount(@RequestBody UserAccount userAccount) {
		Integer result = userAccountService.insertUserAccount(userAccount);
		if (result > 0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("添加用户失败");
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteUserAccount/{userName}")
	public ServerResponse deleteUserAccount(@PathVariable("userName") String userName) {
		Integer result = userAccountService.deleteUserAccount(userName);
		if (result > 0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("删除用户失败");

	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findUserAccountByUserName/{userName}")
	public ServerResponse findUserAccountByUserName(@PathVariable("userName") String userName) {
		UserAccount userAccount = userAccountService.findUserAccountByUserName(userName);
		if (userAccount != null) {
			return ServerResponse.createSuccess(userAccount);
		}
		return ServerResponse.createFail("未找到[" + userName + "]的账户信息");
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/updateUserAccountByUserName")
	public ServerResponse updateUserAccountByUserName(@RequestBody UserAccount userAccount) {
		Integer result = userAccountService.updateUserAccountByUserName(userAccount);
		if (result > 0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("修改[" + userAccount.getUserName() + "]用户信息失败");
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/findUAByUnamePsd/{userName}/{payPass}/{payMoney}/{orderNo}")
	@Transactional
	public ServerResponse findUAByUnamePsd(@PathVariable("userName") String userName,
			@PathVariable("payPass") String payPass, @PathVariable("payMoney") Float payMoney,
			@PathVariable("orderNo") String orderNo) {
		logger.info("userName = "+userName+" payPass = "+payPass+" payMoney = "+payMoney+" orderNo = "+orderNo);
		UserAccount userAccount = userAccountService.findUserAccountByUserNameAndPayPassword(userName, payPass);
		logger.info("userAccount = "+userAccount);

		if (userAccount != null) {
		
			if (userAccount.getBalance().floatValue() - payMoney < 0) {
				// 余额不足
				logger.info(" 余额不足 ");
				return ServerResponse.createFail("余额不足,支付失败");
			}

			// 支付成功,1.先扣减余额
			Integer payResult = userAccountService.updateUADeduction(userName, payMoney);
			logger.info(" payResult :  "+payResult);
			if (payResult <= 0) {
				return ServerResponse.createFail("扣减余额失败,支付失败!");
			}
			
			int a = 1/0;

			// 2.再减少库存
			List<OrderDetail> list = orderDetailService.findOrderDetailByOrderNo(orderNo);
			logger.info(" list :  "+list.toString());
			if (list != null && list.size() != 0) {
				for (OrderDetail od : list) {
					Integer result = productService.updateProductStock(od.getProductId(), od.getQuantity());
					if (result <= 0) {
						return ServerResponse.createFail("扣减库存失败,支付失败!");
					}
				}
			}
			

			return ServerResponse.createFail("支付成功!");
		}
		return ServerResponse.createFail("密码错误");
	}

}
