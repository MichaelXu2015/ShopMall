package com.microservice.controller;

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

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService productCategoryService;

	
	@PostMapping("/insertProductCategory")
	public ServerResponse insertProductCategory(@RequestBody ProductCategory productCategory) {
		if(productCategoryService.insertProductCategory(productCategory)>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	@DeleteMapping("/deleteProductCategory/{categoryId}")
	public ServerResponse deleteProductCategory(@PathVariable("categoryId") Integer categoryId) {
		if(productCategoryService.deleteProductCategory(categoryId)>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	
	}
	
	@PutMapping("/updateProductCategory")
	public ServerResponse updateProductCategory(@RequestBody ProductCategory productCategory) {
		if(productCategoryService.updateProductCategory(productCategory)>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
		
	}
	
	@GetMapping("/findProductCategoryByParentId/{parentId}")
	public ServerResponse findProductCategoryByParentId(@PathVariable("parentId") Integer parentId){
		return ServerResponse.createSuccess(productCategoryService.findProductCategoryByParentId(parentId));
	}
}
