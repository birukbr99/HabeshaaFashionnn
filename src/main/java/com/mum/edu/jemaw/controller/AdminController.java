package com.mum.edu.jemaw.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.Person;
import com.mum.edu.jemaw.service.AddressService;
import com.mum.edu.jemaw.service.ProductService;



/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {

	@Autowired
	AddressService addressService;
		

	@Autowired
	ProductService productService;
	
	private static final Logger logger = LoggerFactory
			.getLogger(AdminController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/admin/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		List<Address> address = addressService.findAll();
		model.addAttribute("addresses", address);
		System.out.println(address.isEmpty());
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "admin/index";
	}

	
	
	
	
}
