package com.mum.edu.jemaw.dao;

import java.util.List;

import com.mum.edu.jemaw.model.Product;

public interface ProductDAO extends GenericDAO<Product>{

	List<Product> findByName(String name);
}
