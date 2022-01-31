package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.StringUtils;
import org.basic.ecommerce.facade.OrderFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderHistoryPageController {

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

	@RequestMapping(value = "/orderHistory")
	public String placeOrder(Model model) throws IOException {
		String userId = "";
		// userId = session.user.id
		model.addAttribute("orders", orderFacade.getOrdersByUser(userId));
		return "orderHistoryPage";
	}

}
