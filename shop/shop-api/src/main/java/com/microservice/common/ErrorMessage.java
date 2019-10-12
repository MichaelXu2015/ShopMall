package com.microservice.common;

/**
 * 错误信息描述
 * @author qzy
 *
 */
public enum ErrorMessage {
	
	
	USER_NAME_EXIST(1000,"用户名已存在."),
	USER_PHONE_EXIST(1001,"手机号码已注册."),
	USER_STATUS_LOCK(1002,"该用户已被锁定.");
	
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
