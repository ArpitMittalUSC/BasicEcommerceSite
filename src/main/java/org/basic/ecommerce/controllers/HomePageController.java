package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomePageController {

	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/")
	public String home(Model model) throws IOException {
		return "master";
	}

	@RequestMapping(value = "/home")
	public String homePage(ModelMap model)
			throws IOException {
		
		//fetch product list according to role of user. If buyer, get all product, if seller, get only product with seller
		/*
		 * if(session.user.role = buyer)
		 * {
		 * 	model.addAttribute("productList", productFacade.getProducts());
		 * }
		 * else if(session.user.role = buyer)
		 * {
		 * 	model.addAttribute("productList", productFacade.getProductsForSeller(session.user.sellerId));
		 * }
		 * 
		*/
		model.addAttribute("productList", productFacade.getProducts());
		return "productListPage";
	}
	
	@RequestMapping(value = "/error")
	public String errorPage(Model model) throws IOException {
		return "errorPage";
	}
}
