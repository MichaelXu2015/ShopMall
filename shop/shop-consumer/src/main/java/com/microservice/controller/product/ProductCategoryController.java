package com.microservice.controller.product;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.microservice.common.ServerResponse;
import com.microservice.entities.ProductCategory;
import com.microservice.service.ProductCategoryService;
import com.microservice.util.RedisUtil;
import com.microservice.vo.ProductCategoryVO;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
	
	Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	RedisUtil redisUtil;
	
	String productInfo = "productInfo";
	
	Gson gson;
	
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/deleteProductCategory/{categoryId}")
	public ServerResponse deleteProductCategory(@PathVariable("categoryId")Integer categoryId) {
		Integer result = productCategoryService.deleteProductCategory(categoryId);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/productCategory/deleteProductCategory")
	public ServerResponse insertProductCategory(@RequestBody ProductCategory productCategory) {
		Integer result = productCategoryService.insertProductCategory(productCategory);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	/*根据父类ID查询该父类ID下的产品*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/productCategory/findProductCategoryByParentId/{parentId}")
	public ServerResponse findProductCategoryByParentId(@PathVariable("parentId")Integer parentId){
		List<ProductCategory> list = productCategoryService.findProductCategoryByParentId(parentId);
		if(list!=null && list.size()!=0) {
			return ServerResponse.createSuccess(list);
		}
		return ServerResponse.createFail("未找到该 ["+parentId+"] 下的商品类别信息");
	}
	
	/*根据产品id查询*/
	@SuppressWarnings("rawtypes")
	@GetMapping("/productCategory/findProductCategoryByCategoryId/{categoryId}")
	public ServerResponse findProductCategoryByCategoryId(@PathVariable("categoryId")Integer categoryId) {
		List<ProductCategory> list = productCategoryService.findProductCategoryByCategoryId(categoryId);
		if(list!=null && list.size()!=0) {
			return ServerResponse.createSuccess(list);
		}
		return ServerResponse.createFail("未找到该 ["+categoryId+"] 下的商品类别信息");
	}
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/productCategory/updateProductCategory")
	public ServerResponse  updateProductCategory(@RequestBody ProductCategory productCategory) {
		Integer result = productCategoryService.updateProductCategory(productCategory);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail();
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/findProductCategoryInfo")
	public ServerResponse  findProductCategoryInfo() {
		logger.info(" --- consumer findProductCategoryInfo --- redis ping =  "+redisUtil.ping());
		gson = new Gson();
		String info = redisUtil.get(productInfo);
		if(info==null || info.equals("")) {
			ProductCategoryVO productCategoryVO = productCategoryService.findProductCategoryInfo();
			if(productCategoryVO!=null) {
				logger.info(" productCategoryVO =  "+productCategoryVO.toString());
				String productInfoJson =  gson.toJson(productCategoryVO);
				redisUtil.set(productInfo, productInfoJson);
				return ServerResponse.createSuccess(productCategoryVO);
			}
		}else {
			String info2 = redisUtil.get(productInfo);
			logger.info(" 从redis中取出商品信息 : "+info2);
			ProductCategoryVO productCategoryVO  = gson.fromJson(info2, ProductCategoryVO.class);
			return ServerResponse.createSuccess(productCategoryVO);
		}
		
		return ServerResponse.createFail("没有产品类别相关信息");
	}

}
