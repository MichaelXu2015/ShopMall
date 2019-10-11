package com.microservice.token;

public class TestToken {
	
	public static void main(String[] args) {
		 JWTTokenUtil jwt = JWTTokenUtil.defaultUtil();
		
		  Token token = jwt.create("shopmall", "shopmall-token", "mobile", "user ,pwd"); //
		  System.out.println(token); 
		  System.out.println(token.getTokenStr());
		  Token token2 = jwt.parse(token.getTokenStr(), "1");
		  System.out.println(token2); 
		  System.out.println(token2.getTokenStr()); 
		  System.out.println("生效时间：" + token2.getPlayload().getNbf());
		  System.out.println("过期时间：" + token2.getPlayload().getExp()); 
		  System.out.println("无效时间：" + token2.getPlayload().getGra()); 
		  System.out.println("非法："+jwt.isIllegality(token2.getTokenStr() ,"1")); 
		  System.out.println("过期：" + jwt.isTimeout(token2)); 
		  System.out.println("无效：" + jwt.isInvalid(token2)); 
		  jwt.refresh(token2); 
		  System.out.println(token2);
		 	
	}

}
