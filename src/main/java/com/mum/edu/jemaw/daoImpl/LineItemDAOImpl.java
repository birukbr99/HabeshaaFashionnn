package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.LineItemDAO;
import com.mum.edu.jemaw.model.LineItem;

@Repository("lineItemDAO")
public class LineItemDAOImpl extends GenericDAOImpl<LineItem> implements LineItemDAO{

	public LineItemDAOImpl() {
		setClazz(LineItem.class);
	}
}
