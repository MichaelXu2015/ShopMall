package com.microservice.controller.product;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.common.ServerResponse;
import com.microservice.entities.AddCart;
import com.microservice.entities.Cart;
import com.microservice.entities.CartDetail;
import com.microservice.entities.User;
import com.microservice.service.CartDetailService;
import com.microservice.service.CartService;
import com.microservice.service.UserService;
import com.microservice.util.UUIDUtil;

/**
 * 购物车模块
 * @author qzy
 *
 */
@RestController
@RequestMapping("/cart")
public class CartController {
	
	Logger logger = Logger.getLogger(getClass());	
	
	@Autowired
	CartService cartService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	CartDetailService cartDetailService;

	@SuppressWarnings("rawtypes")
	@GetMapping("/findCartByUserId/{userId}")
	public ServerResponse findCartByUserId(@PathVariable("userId")String userId) {
		Cart cart = cartService.findCartByUserId(userId);
		if(cart != null) {
			return ServerResponse.createSuccess(cart);
		}
		return ServerResponse.createFail("沒有找到 购物车");
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertCart")
	public ServerResponse insertCart(@RequestBody AddCart addCart) {
		logger.info(" addCart : "+addCart.toString());
		String userId = addCart.getUserId();
		Cart cart = cartService.findCartByUserId(userId);
		if(cart!=null) {
			//更新购物车
			List<CartDetail> listCartDetails = addCart.getList();
			double totalPrice = 0;
			for(CartDetail cd:listCartDetails) {
				totalPrice = totalPrice+cd.getProductPrice().floatValue();
			}
			Integer result = cartService.updateCartTotalPriceByCartId(cart.getCartId(),(float)totalPrice);
			if(result<=0) {
				ServerResponse.createFail("增加购物车失败");
			}
			//2.增加购物车详情
			for(CartDetail cd:listCartDetails) {
				cd.setCartDetailId(UUIDUtil.getCartDetailId());
				result = cartDetailService.insertCartDetail(cd);
				if(result<=0) {
					ServerResponse.createFail("增加购物失败,增加购物车详情失败");
				}
			}	
			return ServerResponse.createSuccess("增加购物车成功");
			
		}else {
			//1.创建购物车
			User user = userService.findUserByUserId(userId);
			cart = new Cart();
			cart.setCartId(userId);//使用userId作为购物车id
			cart.setFullName(user.getFullName());
			List<CartDetail> listCartDetails = addCart.getList();
			double totalPrice = 0;
			for(CartDetail cd:listCartDetails) {
				totalPrice = totalPrice+cd.getProductPrice().floatValue();
			}
			cart.setTotalPrice(BigDecimal.valueOf(totalPrice));
			cart.setUserName(user.getUserName());
			Integer result = cartService.insertCart(cart);
			if(result<=0) {
				ServerResponse.createFail("增加购物车失败");
			}
			//2.增加购物车详情
			for(CartDetail cd:listCartDetails) {
				cd.setCartDetailId(UUIDUtil.getCartDetailId());
				result = cartDetailService.insertCartDetail(cd);
				
				if(result<=0) {
					ServerResponse.createFail("增加购物失败,增加购物车详情失败");
				}
			}	
			
		}
		
		return ServerResponse.createSuccess("增加购物车成功");
	}

	@SuppressWarnings("rawtypes")
	@PutMapping("/updateCartTotalPriceByUserId/{cartId}/{price}")
	public ServerResponse updateCartTotalPriceByUserId(@PathVariable("cartId")String cartId,@PathVariable("price") Float price) {
		Integer result = cartService.updateCartTotalPriceByCartId(cartId, price);
		if(result>0) {
			return ServerResponse.createSuccess();
		}
		return ServerResponse.createFail("更新购物车失败");
	}
}
