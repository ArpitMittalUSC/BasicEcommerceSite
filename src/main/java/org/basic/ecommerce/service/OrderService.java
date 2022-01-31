package org.basic.ecommerce.service;

import java.io.File;
import java.util.List;

import org.basic.ecommerce.dto.OrderDetailsDTO;

public interface OrderService {
	public OrderDetailsDTO getOrderByid(String orderId);

	public List<OrderDetailsDTO> getOrdersByUser(String userId);
	public File placeOrder();

}
