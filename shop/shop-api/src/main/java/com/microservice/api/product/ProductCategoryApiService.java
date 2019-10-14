package com.microservice.api.product;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.entities.ProductCategory;
import com.microservice.vo.ProductCategoryVO;

@FeignClient(value="SHOP-PRODUCT",fallbackFactory=ProductCategoryApiServiceFallBack.class)
public interface ProductCategoryApiService {

	@DeleteMapping("/productCategory/deleteProductCategory/{categoryId}")
	Integer deleteProductCategory(@PathVariable("categoryId")Integer categoryId);
	
	@PostMapping("/productCategory/deleteProductCategory")
	Integer insertProductCategory(@RequestBody ProductCategory productCategory);
	
	/*根据父类ID查询该父类ID下的产品*/
	@GetMapping("/productCategory/findProductCategoryByParentId/{parentId}")
	List<ProductCategory> findProductCategoryByParentId(@PathVariable("parentId")Integer parentId);
	
	/*根据产品id查询*/
	@GetMapping("/productCategory/findProductCategoryByCategoryId/{categoryId}")
	List<ProductCategory> findProductCategoryByCategoryId(@PathVariable("categoryId")Integer categoryId);
	
	@PutMapping("/productCategory/updateProductCategory")
	Integer updateProductCategory(@RequestBody ProductCategory productCategory);
	
	@GetMapping("/findProductCategoryInfo")
	ProductCategoryVO findProductCategoryInfo();
}
