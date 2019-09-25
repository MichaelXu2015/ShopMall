package com.microservice.dao;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.Product;

@Mapper
public interface ProductMapper {
	
	Product findProductById(String productId);

}
