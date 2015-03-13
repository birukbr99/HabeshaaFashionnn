package com.mum.edu.jemaw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.dao.PaymentInfoDAO;
import com.mum.edu.jemaw.model.PaymentInfo;
import com.mum.edu.jemaw.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl  extends GenericServiceImpl<PaymentInfo> implements PaymentInfoService {

	@Autowired
	@Qualifier("paymentInfoDAO")
	public PaymentInfoDAO paymentInfoDAO;
	
	@Override
	protected GenericDAO getDAO() {
		// TODO Auto-generated method stub
		return paymentInfoDAO;
	}
}
