package org.basic.ecommerce.facade;

import org.basic.ecommerce.dto.CartDetailsDTO;

public interface CartFacade {
	public CartDetailsDTO getSessionCart();
}
