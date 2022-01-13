package com.awanish.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.awanish.core.dao.service.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {
	@Autowired
	PaymentServiceImpl service;
    //this method is used to create the dependency-injection
	@Test
	public void testDependencyInjection() {
		
		assertNotNull(service.getDao());
	}

}
