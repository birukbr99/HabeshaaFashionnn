package com.mum.edu.jemaw.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mum.edu.jemaw.model.ShoppingCart;
import com.mum.edu.jemaw.service.CustomerService;
import com.mum.edu.jemaw.service.ProductService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	@Autowired
	ProductService productService;
	
	
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String clientHome(HttpServletRequest request, Model model) {
		return null; }

		
	@RequestMapping(value = "/HomePage", method = RequestMethod.GET)
	public String index() {
		return "/HomePage";
	}
	
	@RequestMapping(value = "/HomePageReload", method = RequestMethod.GET)
	public String indexReload(@ModelAttribute("orderFailed") boolean order) {
		return "/HomePage";
	}

	
}
