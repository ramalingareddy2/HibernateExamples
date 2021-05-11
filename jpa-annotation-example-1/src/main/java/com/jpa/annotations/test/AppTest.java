package com.jpa.annotations.test;

import com.jpa.annotations.dao.CustomerDao;
import com.jpa.annotations.helper.EntityManagerFactoryRegistry;

public class AppTest {
	public static void main(String[] args) {
		try {
		CustomerDao customerDao=new CustomerDao();
		System.out.println(customerDao.findCustomerById(1));
		}finally {
			EntityManagerFactoryRegistry.closeEntityManagerFactory();
		}
	}

}
