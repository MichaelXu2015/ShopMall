package com.microservice.util;

import java.util.UUID;

public class UUIDUtil {
	
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static String getCartDetailId() {
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10);
	}

}
