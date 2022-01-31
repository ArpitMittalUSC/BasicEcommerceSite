package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.facade.CartFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartPageController {

	@Resource(name = "cartFacade")
	private CartFacade cartFacade;

	@RequestMapping(value = "/cart")
	public String cart(Model model) throws IOException {
		model.addAttribute("cartData", cartFacade.getSessionCart());
		return "cartPage";
	}

}
