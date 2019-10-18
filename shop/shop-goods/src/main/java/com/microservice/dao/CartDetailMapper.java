package com.microservice.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.microservice.entities.CartDetail;

@Mapper
public interface CartDetailMapper {
	
	
	//根据cartId(userId)查询购物车的详情
	public List<CartDetail> findCartDetailByCartId(String cartId);
	
	//添加购物车详情
	public Integer insertCartDetail(CartDetail cartDetail);
	
	//从购物车中删除这个商品
	public Integer deleteCartDetail(String cartDetailId);
	
	
	
}
