package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.AddressDAO;
import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.service.AddressService;


@Service("addressService")
public class AddressServiceImpl {
	
	@Autowired
	@Qualifier("addressDAO")
	public AddressDAO addressDAO;

	protected Address getDAO(Long id) {
		return  addressDAO.findOne(id);
	}


}
