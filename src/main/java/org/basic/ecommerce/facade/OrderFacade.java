package org.basic.ecommerce.facade;

import java.io.File;
import java.util.List;

import org.basic.ecommerce.dto.OrderDetailsDTO;

public interface OrderFacade {
	public OrderDetailsDTO getOrderByid(String orderId);

	public List<OrderDetailsDTO> getOrdersByUser(String userId);
	
	public File placeOrder();
	
}
