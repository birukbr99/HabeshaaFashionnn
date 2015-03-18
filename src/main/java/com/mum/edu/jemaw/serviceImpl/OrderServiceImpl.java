package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.OrderDAO;
import com.mum.edu.jemaw.model.Order;
import com.mum.edu.jemaw.service.OrderService;


@Service("orderService")
public class OrderServiceImpl {

	@Autowired
	@Qualifier("orderDAO")
	public OrderDAO orderDAO;
	
	
	
	protected Order getDAO(Long id) {
		// TODO Auto-generated method stub
		return orderDAO.findOne(id);
	}
}
