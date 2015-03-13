package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.ShoppingCartDAO;
import com.mum.edu.jemaw.model.ShoppingCart;

@Service("shoppingCartService")
public class ShoppingCartServiceImpl extends GenericServiceImpl<ShoppingCart>{

	@Autowired
	@Qualifier("shoppingCartDAO")
	public ShoppingCartDAO shoppingCart;
	
	@Override
	protected GenericDAO getDAO() {
		// TODO Auto-generated method stub
		return shoppingCart;
	}
}
