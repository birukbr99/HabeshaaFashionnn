package com.mum.edu.jemaw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mum.edu.jemaw.model.Address;
import com.mum.edu.jemaw.model.PaymentInfo;

public interface PaymentInfoDAO extends JpaRepository<PaymentInfo,Long> {

}
