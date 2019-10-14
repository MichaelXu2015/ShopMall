package com.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.api.product.ProductCategoryApiService;
import com.microservice.entities.ProductCategory;
import com.microservice.service.ProductCategoryService;
import com.microservice.vo.ChildProductCategoryVO;
import com.microservice.vo.ProductCategoryVO;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	
	@Autowired
	ProductCategoryApiService productCategoryApiService;
	

	@Override
	public Integer deleteProductCategory(Integer categoryId) {
		return productCategoryApiService.deleteProductCategory(categoryId);
	}

	@Override
	public Integer insertProductCategory(ProductCategory productCategory) {
		return productCategoryApiService.insertProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> findProductCategoryByParentId(Integer parentId) {
		return productCategoryApiService.findProductCategoryByParentId(parentId);
	}

	@Override
	public Integer updateProductCategory(ProductCategory productCategory) {
		return productCategoryApiService.updateProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> findProductCategoryByCategoryId(Integer categoryId) {
		return productCategoryApiService.findProductCategoryByCategoryId(categoryId);
	}
	
	
	/**
	 *  	查询产品类别信息
	 * @return
	 */
	@Override
	public ProductCategoryVO findProductCategoryInfo() {
		List<ProductCategory> rootProductCategoryList = productCategoryApiService.findProductCategoryByParentId(0);
		ProductCategoryVO productCategoryVO3 = new ProductCategoryVO();
		List<ChildProductCategoryVO> rootList = new ArrayList<ChildProductCategoryVO>();
		if(rootProductCategoryList!=null && rootProductCategoryList.size()!=0) {
			for(ProductCategory pc:rootProductCategoryList) {
				List<ProductCategory> childProductCategoryList = productCategoryApiService.findProductCategoryByCategoryId(pc.getCategoryId());
				ChildProductCategoryVO productCategoryVO = new ChildProductCategoryVO();
				productCategoryVO.setChildCategoryList(childProductCategoryList);
				productCategoryVO.setParentName(pc.getCategoryName());
				productCategoryVO.setCategoryCode(pc.getCategoryCode());
				productCategoryVO.setParentId(pc.getParentId());
				rootList.add(productCategoryVO);
				
			}
			productCategoryVO3.setChildProductCategoryList(rootList);
		}
		return productCategoryVO3;
	}

	

}
