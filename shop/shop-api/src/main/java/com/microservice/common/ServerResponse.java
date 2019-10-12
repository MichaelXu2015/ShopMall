package com.microservice.common;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @note 服务器返回给客户端消息的通用格式,注意给此类添加get/set方法
 * @author qzy
 * @param <T>
 */
public class ServerResponse<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private T data;
	
	private ServerResponse(Integer status){
		this.status = status;
	}
	
	private ServerResponse(Integer status,String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	private ServerResponse(Integer status,T data) {
		this.status = status;
		this.data = data;
	}
	
	private ServerResponse(Integer status,String msg,T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	//在json里忽略此方法
	@JsonIgnore
	public boolean success() {
		return this.status == ServerResponseCode.SUCCESS.getCode();
	}
	
	public static <T> ServerResponse<T> createSuccess(){
		return new ServerResponse<T>(ServerResponseCode.SUCCESS.getCode());
	}
	
	public static <T> ServerResponse<T> createSuccess(String msg){
		return new ServerResponse<T>(ServerResponseCode.SUCCESS.getCode(), msg);
	}
	
	public static <T> ServerResponse<T> createSuccess(T data){
		return new ServerResponse<T>(ServerResponseCode.SUCCESS.getCode(),ServerResponseCode.SUCCESS.getMsg(),data);
	}
	
	public static <T> ServerResponse<T> createSuccess(String msg,T data){
		return new ServerResponse<T>(ServerResponseCode.SUCCESS.getCode(), msg, data);
	}
	
	
	public static <T> ServerResponse<T> createFail(){
		return new ServerResponse<T>(ServerResponseCode.FAIL.getCode(),ServerResponseCode.FAIL.getMsg());
	}
	
	public static <T> ServerResponse<T> createFail(String msg){
		return new ServerResponse<T>(ServerResponseCode.FAIL.getCode(),msg);
	}
	

	
	public static <T> ServerResponse<T> createFail(Integer status,String msg){
		return new ServerResponse<T>(status,msg);
	}
	

}
