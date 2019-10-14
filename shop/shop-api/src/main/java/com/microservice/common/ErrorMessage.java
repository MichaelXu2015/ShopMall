package com.microservice.common;

/**
 * 错误信息描述
 * @author qzy
 *
 */
public enum ErrorMessage {
	
	
	USER_NAME_EXIST(1000,"用户名已存在."),
	USER_PHONE_EXIST(1001,"手机号码已注册."),
	USER_STATUS_LOCK(1002,"该用户已被锁定."),
	USER_LOGIN_FAIL(1003,"用户登录失败."),
	USER_REGISTER_FAIL(1004,"用户注册失败."),
	USER_UPDATE_FAIL(1005,"用户信息更新失败."),
	USER_DELETE_FAIL(1006,"用户信息删除失败."),
	USER_FIND_FAIL(1007,"查询用户信息失败."),
	
	PRODUCT_CATEGORY_FIND_FAIL(2000,"查询商品分类信息失败."),
	PRODUCT_CATEGORY_INSERT_FAIL(2001,"插入商品分类信息失败."),
	PRODUCT_CATEGORY_UPDATE_FAIL(2002,"更新商品分类信息失败."),
	PRODUCT_CATEGORY_DELETE_FAIL(2002,"删除商品分类信息失败.");

	
	
	private Integer code;
	private String msg;
	
	private ErrorMessage(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
