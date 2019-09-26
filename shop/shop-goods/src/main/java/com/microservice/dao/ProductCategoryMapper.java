package com.microservice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microservice.entities.ProductCategory;

@Mapper
public interface ProductCategoryMapper {
	
	/*根据产品的类别ID删除*/
	Integer deleteProductCategory(Integer categoryId);
	
	Integer insertProductCategory(ProductCategory productCategory);
	
	/*根据父类ID查询该父类ID下的产品*/
	List<ProductCategory> findProductCategoryByParentId(Integer parentId);
	
	Integer updateProductCategory(ProductCategory productCategory);
	
	
	

}
