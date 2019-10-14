package com.microservice.common;

public class ProductCategoryException extends BaseException{

	public ProductCategoryException(ErrorMessage errorMessage) {
		super(errorMessage);
	}
	
	@Override
	public ErrorMessage getErrorMessage() {
		return super.getErrorMessage();
	}
	
	@Override
	public void setErrorMessage(ErrorMessage errorMessage) {
		super.setErrorMessage(errorMessage);
	}

}
