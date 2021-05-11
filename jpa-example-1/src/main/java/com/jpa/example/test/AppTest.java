package com.jpa.example.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jpa.example.entities.Customer;
import com.jpa.example.helper.EntityManagerFactoryRegistry;
import com.jpa.example.helper.SessionFactoryRegistry;

public class AppTest {
	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		Customer customer=null;
		
		try {
			emf=EntityManagerFactoryRegistry.getEmf();
			em=emf.createEntityManager();
			customer=em.find(Customer.class, 1);
			System.out.println(customer);
		}finally {
			if(em!=null)
				em.close();
			
			//EntityManagerFactoryRegistry.closeEmf();
		}
	}

}
