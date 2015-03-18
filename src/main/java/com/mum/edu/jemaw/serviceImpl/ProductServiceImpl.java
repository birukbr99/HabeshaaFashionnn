package com.mum.edu.jemaw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.ProductDAO;
import com.mum.edu.jemaw.model.Product;
import com.mum.edu.jemaw.service.ProductService;

@Service("productService")
public class ProductServiceImpl {

	@Autowired
	@Qualifier("productDAO")
	public ProductDAO productDAO;
	
	protected Product getDAO(Long id) {
		// TODO Auto-generated method stub
		return productDAO.findOne(id);
	}

	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productDAO.findByName(name);
	}
	
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.findAll();
	}

}
