package com.mum.edu.jemaw.service;

import java.util.List;

import com.mum.edu.jemaw.model.Product;


public interface ProductService extends GenericService<Product>{

	List<Product> findByName(String name);
}
