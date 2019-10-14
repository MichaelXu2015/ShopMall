package com.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.common.ServerResponse;
import com.microservice.entities.ProductCategory;
import com.microservice.service.ProductCategoryService;
import com.microservice.vo.ChildProductCategoryVO;
import com.microservice.vo.ParentProductCategoryVO;
import com.microservice.vo.ProductCategoryVO;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService productCategoryService;

	
	@PostMapping("/insertProductCategory")
	public Integer insertProductCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryService.insertProductCategory(productCategory);
	
	}
	
	@DeleteMapping("/deleteProductCategory/{categoryId}")
	public Integer deleteProductCategory(@PathVariable("categoryId") Integer categoryId) {
		return productCategoryService.deleteProductCategory(categoryId);
	
	}
	
	@PutMapping("/updateProductCategory")
	public Integer updateProductCategory(@RequestBody ProductCategory productCategory) {
		return productCategoryService.updateProductCategory(productCategory);
		
	}
	
	@GetMapping("/findProductCategoryByParentId/{parentId}")
	public List<ProductCategory> findProductCategoryByParentId(@PathVariable("parentId") Integer parentId){
		return productCategoryService.findProductCategoryByParentId(parentId);
	}
	
	@GetMapping("/findProductCategoryByCategoryId/{categoryId}")
	public List<ProductCategory> findProductCategoryByCategoryId(@PathVariable("categoryId") Integer categoryId){
		return productCategoryService.findProductCategoryByCategoryId(categoryId);
	}
	
	/**
	 * 查询产品信息
	 * @return
	 */
	@GetMapping("/findProductCategoryInfo")
	public ProductCategoryVO findProductCategoryInfo() {
		System.out.println(" findProductCategoryInfo 22222222222222222");
		return productCategoryService.findProductCategoryInfo();
		
	}
	
}
