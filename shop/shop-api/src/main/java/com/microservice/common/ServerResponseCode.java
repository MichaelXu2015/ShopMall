package com.microservice.common;

public enum ServerResponseCode {
	
	
	//CREATE_SUCCESS(201,"create success"),
	SUCCESS(200,"response success"),
	NEED_LOGIN(401,"need login"),
	UNAUTHORIZED(403,"Unauthorized"),
	FAIL(500,"fail");
	
	private Integer code;
	private String msg;
	
	 ServerResponseCode(Integer code,String msg) {
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
