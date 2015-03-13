package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.OrderDAO;
import com.mum.edu.jemaw.model.Order;

@Repository("orderDAO")
public class OrderDAOImpl extends GenericDAOImpl<Order> implements OrderDAO{

	public OrderDAOImpl() {
		 setClazz(Order.class );
	}
}