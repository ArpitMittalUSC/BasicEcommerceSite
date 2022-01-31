package org.basic.ecommerce.facadeImpl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.OrderDetailsDTO;
import org.basic.ecommerce.facade.OrderFacade;
import org.basic.ecommerce.service.OrderService;

public class OrderFacadeImpl implements OrderFacade {
	@Resource(name = "orderService")
	private OrderService orderService;

	@Override
	public OrderDetailsDTO getOrderByid(String orderId) {
		return orderService.getOrderByid(orderId);
	}

	@Override
	public List<OrderDetailsDTO> getOrdersByUser(String userId) {
		return orderService.getOrdersByUser(userId);
	}

	@Override
	public File placeOrder() {
		return orderService.placeOrder();
	}

}
