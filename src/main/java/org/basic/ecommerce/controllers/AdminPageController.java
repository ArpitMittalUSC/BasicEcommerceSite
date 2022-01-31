package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.facade.CartFacade;
import org.basic.ecommerce.facade.ProductFacade;
import org.basic.ecommerce.facade.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPageController {

	@Resource(name = "cartFacade")
	private CartFacade cartFacade;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/adminDetails", method = RequestMethod.GET)
	public String adminDetails(@RequestParam(name = "queryType", required = false) String queryType, Model model)
			throws IOException {
		// authenticate Admin Credentials

		if (queryType.equals("users")) {
			model.addAttribute("usersListData", userFacade.getAllUsers());
			return "adminUserDetails";
		}
		if (queryType.equals("products")) {
			model.addAttribute("productListData", productFacade.getProducts());
			return "adminProductListDetails";
		}
		if (queryType.equals("productReviews")) {
			model.addAttribute("productListData", productFacade.getProducts());
			return "adminProductReviewsDetails";
		}
		return "No Data Found";
	}

	@RequestMapping(value = "/adminPortal")
	public String adminPortal(Model model) throws IOException {
		model.addAttribute("cartData", cartFacade.getSessionCart());
		return "adminDetails";
	}
}
