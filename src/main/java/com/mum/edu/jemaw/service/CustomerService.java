package com.mum.edu.jemaw.service;
import java.util.List;

import com.mum.edu.jemaw.model.Customer;

public interface CustomerService {

	List<Customer> getAllCustomeres();

	Customer getCustomer(long id);

	void saveCustomer(Customer customer);

}
