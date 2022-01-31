package org.basic.ecommerce.facadeImpl;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.CartDetailsDTO;
import org.basic.ecommerce.facade.CartFacade;
import org.basic.ecommerce.service.CartService;

public class CartFacadeImpl implements CartFacade {
	@Resource(name = "cartService")
	private CartService cartService;

	@Override
	public CartDetailsDTO getSessionCart() {
		return cartService.getSessionCart();
	}

}
