package com.mum.edu.jemaw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.model.LineItem;
import com.mum.edu.jemaw.model.Product;
import com.mum.edu.jemaw.model.ShoppingCart;
import com.mum.edu.jemaw.service.CustomerService;
import com.mum.edu.jemaw.service.ProductService;


@Controller
@SessionAttributes("shoppingCart")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	ProductService productService;
	
	
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String productSearch(){
		
		return "Product";
	}
	
	@RequestMapping("/product/vendorCategory/{id}/{cid}")
	public String getProductWithVendorCategory(@PathVariable("id") Long id, Model model,@PathVariable("cid") Long cid){
	
		List<Product> productList = productService.findByVendorAndCategoryName(id, cid);
		model.addAttribute("productList", productList);
 		return "searchresult";
	}
	
	@RequestMapping(value = "/productSearch", method = RequestMethod.POST)
	public String productSearchResult(Model model, @RequestParam String name,HttpServletRequest request){
		System.out.println("name:: " + name);
		List<Product> searchResult = productService.findByName(name);
		model.addAttribute("productList",searchResult);
 		return "searchresult";
	}
	
	@RequestMapping("/product/category/{id}")
	public String getProductWithCategory(@PathVariable("id") Long id, Model model){
	
		List<Product> productList = productService.findByCategory(id);
		model.addAttribute("productList", productList);
 		return "searchresult";
	}
	
	
}
