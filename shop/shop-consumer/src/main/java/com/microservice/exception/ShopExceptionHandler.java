package com.microservice.exception;


import javax.jws.HandlerChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservice.common.BaseException;
import com.microservice.common.ServerResponse;
import com.microservice.common.UserException;


@ControllerAdvice
@ResponseBody
public class ShopExceptionHandler {
	
		Logger logger = Logger.getLogger(getClass());
	
	   @SuppressWarnings("rawtypes")
	   @ExceptionHandler(value=BaseException.class)
	   public ServerResponse exceptionHandler(HttpServletRequest request,HttpServletResponse response,Exception e ) {
		   logger.info("===========exceptionHandler============");
		   if(e instanceof UserException) {
			   logger.info("===========e instanceof UserException============");
			   UserException ue = (UserException)e;
			   return ServerResponse.createFail(ue.getErrorMessage().getCode(),ue.getErrorMessage().getMsg());
		   }
		   return ServerResponse.createFail(9999, "未知异常");
	  
	  }
	 

}
