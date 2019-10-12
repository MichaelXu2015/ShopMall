package com.microservice.common;

public class UserException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4698810723010234979L;

	public UserException(ErrorMessage errorMessage) {
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
