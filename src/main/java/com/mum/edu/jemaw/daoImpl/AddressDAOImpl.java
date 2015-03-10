package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.AddressDAO;
import com.mum.edu.jemaw.model.Address;



@Repository("addressDAO")

public class AddressDAOImpl extends GenericDAOImpl<Address> implements AddressDAO {
	
}
