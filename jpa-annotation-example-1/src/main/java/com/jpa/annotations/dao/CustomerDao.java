package com.jpa.annotations.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.jpa.annotations.entities.Customer;
import com.jpa.annotations.helper.EntityManagerFactoryRegistry;

public class CustomerDao {
	
	public Customer findCustomerById(int id) {
		Customer customer=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		
		try {
			entityManagerFactory=EntityManagerFactoryRegistry.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			customer=entityManager.find(Customer.class, 1);
		}finally {
			if(entityManager!=null)
				entityManager.close();
		}
		return customer;
	}

}
