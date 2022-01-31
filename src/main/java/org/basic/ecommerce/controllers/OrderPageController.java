package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.facade.OrderFacade;
import org.basic.ecommerce.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OrderPageController {

	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;
	
	@RequestMapping(value = "/placeOrder")
	public String placeOrder(Model model) throws IOException {
		
		//Pick Cart from Session and PLace Order with Payment Details
		orderFacade.placeOrder();
		return "redirect:" + "/orderConfirmation";
	}

	@RequestMapping(value = "/orderConfirmation")
	public String orderConfirmation(Model model) throws IOException {
		return "orderConfirmation";
	}
	
}
