package com.mum.edu.jemaw.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mum.edu.jemaw.model.Product;


public interface ProductService extends GenericService<Product>{

	List<Product> findByName(String name);
	List<Product> getAllProducts();
	

	Product getProductById(String productID);
	
	List<Product> getProductsByCategory(String category);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	void addProduct(Product product);
}
