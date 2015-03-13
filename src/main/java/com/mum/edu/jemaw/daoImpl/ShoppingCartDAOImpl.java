package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.ShoppingCartDAO;
import com.mum.edu.jemaw.model.ShoppingCart;


@Repository("shoppingCartDAO")
public class ShoppingCartDAOImpl extends GenericDAOImpl<ShoppingCart> implements ShoppingCartDAO{

	public ShoppingCartDAOImpl() {
		setClazz(ShoppingCart.class);
	}
}
