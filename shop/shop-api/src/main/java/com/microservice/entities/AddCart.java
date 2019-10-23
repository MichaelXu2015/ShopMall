package com.microservice.entities;

import java.util.List;

/**
 * 添加购物车
 * @author qzy
 *
 */
public class AddCart {
	
	private String userId;
	private List<CartDetail> list;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<CartDetail> getList() {
		return list;
	}
	public void setList(List<CartDetail> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "AddCart [userId=" + userId + ", list=" + list + "]";
	}
	

	
}
