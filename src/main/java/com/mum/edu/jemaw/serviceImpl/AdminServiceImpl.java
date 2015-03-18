package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.AddressDAO;
import com.mum.edu.jemaw.dao.AdminDAO;
import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.Admin;
import com.mum.edu.jemaw.service.AdminService;

@Service("adminService")
public class AdminServiceImpl {
	@Autowired
	@Qualifier("adminDAO")
	public AdminDAO adminDAO;

	protected Admin getDAO(Long id) {
		return adminDAO.findOne(id);
	}
}
