package com.mum.edu.jemaw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	/*@Autowired
	private ProductService productService;*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String clientHome(Model model) {
		/*List<Product> searchResult = productService.findAll();
		model.addAttribute("productList", searchResult);*/
		return "/HomePage";
	}
	
}
