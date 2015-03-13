package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.AdminDAO;
import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.model.Admin;
import com.mum.edu.jemaw.service.AdminService;

@Service("adminService")
public class AdminServiceImpl extends GenericServiceImpl<Admin> implements AdminService {

	@Autowired
	@Qualifier("adminDAO")
	public AdminDAO adminDAO;

	@Override
	protected GenericDAO getDAO() {
		return adminDAO;
	}
}
