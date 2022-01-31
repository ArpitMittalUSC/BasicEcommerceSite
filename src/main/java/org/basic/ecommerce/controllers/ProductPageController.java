package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.LoginDetailsDTO;
import org.basic.ecommerce.dto.ProductDetailsDTO;
import org.basic.ecommerce.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductPageController {

	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/product/{skuid}", method = RequestMethod.GET)
	public String productDetails(@PathVariable("skuid") String skuid, Model model) throws IOException {
		model.addAttribute("product", productFacade.getProductBySkuId(skuid));
		return "productDetailsPage";
	}

	@RequestMapping(value = "/product/createNewProduct", method = RequestMethod.GET)
	public String createProduct(Model model) throws IOException {
		return "createProduct";
	}
	
	@RequestMapping(value = "/product/submitNewProduct", method = RequestMethod.POST)
	public String submitNewProduct(@ModelAttribute("product") ProductDetailsDTO product, Model model) throws IOException {
		return "createProduct";
	}
}
