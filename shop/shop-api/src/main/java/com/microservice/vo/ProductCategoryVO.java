package com.microservice.vo;

import java.util.List;
import com.microservice.entities.ProductCategory;


public class ProductCategoryVO {
	
	List<ProductCategory> rootList;//1.先查出parent_id = 0;
	
	List<List<ProductCategory>> childList; //2.再根据第一步查出的值遍历拿到category_id,根据此id查出子列表
	

}
