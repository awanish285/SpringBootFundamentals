package com.awanish.core.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awanish.core.dao.PaymentDao;
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao dao;

	public PaymentDao getDao() {
		return dao;
	}

	public void setDao(PaymentDao dao) {
		this.dao = dao;
	}
}
