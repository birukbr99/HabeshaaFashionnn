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
public class ProductServiceImpl extends GenericServiceImpl<Product> implements ProductService{

	@Autowired
	@Qualifier("productDAO")
	public ProductDAO productDAO;
	
	@Override
	protected GenericDAO getDAO() {
		// TODO Auto-generated method stub
		return productDAO;
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productDAO.findByName(name);
	}

}
