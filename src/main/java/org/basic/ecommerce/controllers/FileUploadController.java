package org.basic.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@ResponseBody
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam(name = "file", required = false) MultipartFile file, Model model) {
	}
}