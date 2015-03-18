package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.ShoppingCartDAO;
import com.mum.edu.jemaw.model.ShoppingCart;

@Service("shoppingCartService")
public class ShoppingCartServiceImpl {

	@Autowired
	@Qualifier("shoppingCartDAO")
	public ShoppingCartDAO shoppingCart;
	
	protected ShoppingCart getDAO(Long id) {
		// TODO Auto-generated method stub
		return shoppingCart.findOne(id);
	}
}
