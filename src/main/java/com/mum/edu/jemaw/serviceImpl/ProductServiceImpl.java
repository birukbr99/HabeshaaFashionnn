package com.mum.edu.jemaw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.ProductDAO;
import com.mum.edu.jemaw.model.Person;
import com.mum.edu.jemaw.model.Product;
import com.mum.edu.jemaw.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService{

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByVendorAndCategoryName(Long id, Long cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategory(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
