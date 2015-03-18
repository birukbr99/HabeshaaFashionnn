package com.mum.edu.jemaw.service;

import com.mum.edu.jemaw.model.Customer;




public interface CustomerService {

	public void saveCustomer(Customer customer);
	public void save(Customer customer);
	public Customer update(Customer customer);
	public Customer findOne(Long id);
}
