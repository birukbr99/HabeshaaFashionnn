package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.LineItemDAO;
import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.model.LineItem;
import com.mum.edu.jemaw.service.CustomerService;
import com.mum.edu.jemaw.service.LineItemService;


@Service("lineItemService")
public class LineItemServiceImpl extends GenericServiceImpl<LineItem> {

	@Autowired
	@Qualifier("lineItemDAO")
	public LineItemDAO lineItemDAO;
	
	@Override
	protected GenericDAO getDAO() {
		// TODO Auto-generated method stub
		return lineItemDAO;
	}
}
