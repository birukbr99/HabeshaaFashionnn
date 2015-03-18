package com.mum.edu.jemaw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.model.ShoppingCart;
import com.mum.edu.jemaw.service.CustomerService;



@Controller
@SessionAttributes({"shoppingCart","user"})
public class ShoppingCartController {
	@Autowired CustomerService customerService;
	
	@RequestMapping("/shoppingCart")
	public String viewshoppingcart(){
		
 		return "buy";
	}
	
	@RequestMapping(value = "/clearCart", method = RequestMethod.GET)
	public String clearCart(Model model, HttpServletRequest request){
		
		model.addAttribute("shoppingCart", new ShoppingCart());
		if (model.containsAttribute("user")) {
			Customer cust = (Customer) request.getSession().getAttribute("user");
			//shoppingCartService.update(shoppingCart);
			cust.setShoppingCart(new ShoppingCart());
			cust = customerService.update(cust);
			model.addAttribute("user",cust);
			
		}
		
		return "buy";
	}
	
	@RequestMapping(value = "/shoppingCart/delete/{id}")
	public String deleteLineItemWithIdFromCart(@PathVariable("id") int id, 
			@ModelAttribute("shoppingCart") ShoppingCart shoppingCart , HttpServletRequest request, Model model){
		
		shoppingCart.removeCartItem(shoppingCart.getItems().get(id));
		if (model.containsAttribute("user")) {
			Customer cust = (Customer) request.getSession().getAttribute("user");
			//shoppingCartService.update(shoppingCart);
			cust.setShoppingCart(shoppingCart);
			cust = customerService.update(cust);
			model.addAttribute("user",cust);
			
		}
		
		
		
		return "buy";
	}
}


