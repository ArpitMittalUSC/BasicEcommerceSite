package org.basic.ecommerce.service;

import org.basic.ecommerce.dto.CartDetailsDTO;

public interface CartService {
	public CartDetailsDTO getSessionCart();
}
