package com.mum.edu.jemaw.service;

import java.util.List;

import com.mum.edu.jemaw.model.Person;
import com.mum.edu.jemaw.model.Product;

public interface ProductService {

	public void update(Person person);

	public Product findOne(Long id);

	public List<Product> findByVendorAndCategoryName(Long id, Long cid);

	public List<Product> findByName(String name);

	public List<Product> findByCategory(Long id);

}
