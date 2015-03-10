package com.mum.edu.jemaw.daoImpl;

import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.PaymentInfoDAO;
import com.mum.edu.jemaw.model.PaymentInfo;

@Repository("paymentDetailsDAO")
public class PaymentInfoDAOImpl extends GenericDAOImpl<PaymentInfo> implements PaymentInfoDAO {

	public PaymentInfoDAOImpl() {

		setClazz(PaymentInfo.class);

	}
}