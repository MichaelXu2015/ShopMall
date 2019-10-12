package com.microservice.common;

public abstract class BaseException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1370728389607782802L;
	
	private ErrorMessage errorMessage;

	public BaseException(ErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
	
	
	
	
	

}
