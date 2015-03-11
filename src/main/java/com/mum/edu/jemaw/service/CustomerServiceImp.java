package com.mum.edu.jemaw.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.model.Customer;
@Service
public class CustomerServiceImp implements CustomerService {
	
	private List<Customer> customeres;

	public CustomerServiceImp() {
		customeres = new ArrayList<Customer>();
	}

	@Override
	public List<Customer> getAllCustomeres() {
		return customeres;
	}

	@Override
	public Customer getCustomer(long id) {
		for (Customer customer : customeres) {
            if (id == customer.getId()) {
                return customer;
            }
        }
        return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		customeres.add(customer);

	}

}
