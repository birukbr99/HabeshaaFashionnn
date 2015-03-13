package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.CustomerDAO;
import com.mum.edu.jemaw.model.Customer;


@Repository("customerDAO")
public class CustomerDAOImpl extends GenericDAOImpl<Customer> implements CustomerDAO {
	public CustomerDAOImpl() {
		setClazz(Customer.class);
	}
}
