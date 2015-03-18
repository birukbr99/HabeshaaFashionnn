package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.CustomerDAO;
import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl {

	@Autowired
	@Qualifier("customerDAO")
	public CustomerDAO customerDAO;

	
	protected Customer getDAO(Long id) {
		return customerDAO.findOne(id);
	}
}
