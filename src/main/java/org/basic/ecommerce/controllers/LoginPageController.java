package org.basic.ecommerce.controllers;

import java.io.IOException;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.LoginDetailsDTO;
import org.basic.ecommerce.facade.ProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginPageController {
	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String login(@ModelAttribute("loginDetails") LoginDetailsDTO loginDetails, BindingResult result,
			ModelMap model, RedirectAttributes redirectAttributes) throws IOException {

		if(validateCredentials(loginDetails)) {
			createSession();
			return "redirect:" + "/home";
		}
		else {
			return "redirect:" + "/error";
		}
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("loginDetails") LoginDetailsDTO loginDetails, BindingResult result,
			ModelMap model, RedirectAttributes redirectAttributes) throws IOException {

		saveUserDetails(loginDetails);
		createSession();
		return "redirect:" + "/home";
		//return "productListPage";
	}

	private void saveUserDetails(LoginDetailsDTO loginDetails) {
		// TODO Auto-generated method stub

	}

	private boolean validateCredentials(LoginDetailsDTO loginDetails) {
		// TODO Auto-generated method stub
		// check for validity. If not valid, return false
		return true;
	}

	private void createSession() {
		// TODO Auto-generated method stub

	}
}
