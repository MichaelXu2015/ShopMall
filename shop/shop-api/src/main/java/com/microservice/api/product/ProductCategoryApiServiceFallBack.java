package com.microservice.api.product;

import java.util.List;

import org.springframework.stereotype.Component;

import com.microservice.common.ErrorMessage;
import com.microservice.common.ProductCategoryException;
import com.microservice.entities.ProductCategory;
import com.microservice.vo.ProductCategoryVO;

import feign.hystrix.FallbackFactory;

@Component
public class ProductCategoryApiServiceFallBack implements FallbackFactory<ProductCategoryApiService> {

	@Override
	public ProductCategoryApiService create(Throwable cause) {
		return new ProductCategoryApiService() {
			
			@Override
			public Integer updateProductCategory(ProductCategory productCategory) {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_UPDATE_FAIL);
			}
			
			@Override
			public Integer insertProductCategory(ProductCategory productCategory) {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_INSERT_FAIL);
			}
			
			@Override
			public List<ProductCategory> findProductCategoryByParentId(Integer parentId) {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_FIND_FAIL);
			}
			
			@Override
			public List<ProductCategory> findProductCategoryByCategoryId(Integer categoryId) {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_FIND_FAIL);
			}
			
			@Override
			public Integer deleteProductCategory(Integer categoryId) {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_DELETE_FAIL);
			}

			@Override
			public ProductCategoryVO findProductCategoryInfo() {
				throw new ProductCategoryException(ErrorMessage.PRODUCT_CATEGORY_FIND_FAIL);
			}
		};
	}

}
