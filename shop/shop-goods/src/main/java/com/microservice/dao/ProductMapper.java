package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.microservice.entities.Product;

@Mapper
public interface ProductMapper {
	
	Product findProductById(String productId);

	Integer insertProduct(Product product);
	
	Integer updateProduct(Product product);
	
	Integer deleteProductById(String productId);
	
	List<Product> findProductByCategoryCode(String categoryCode);
	
	//更新产品库存
	Integer updateProductStock(@Param("productId")String productId,@Param("stock")Integer stock);
	
}
