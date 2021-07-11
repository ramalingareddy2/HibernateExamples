package com.amtm.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.amtm.entities.Customer;
import com.amtm.entities.Loan;
import com.amtm.helper.EntityManagerFactoryHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=null;
    	EntityManager em=null;
    	EntityTransaction transaction=null;
    	Loan loan=null;
    	Customer customer1=null;
    	Customer customer2=null;
    	boolean flag=false;
    	Set<Customer> customers=null;
    	try {
    		emf=EntityManagerFactoryHelper.getEmf();
    		em=emf.createEntityManager();
    		transaction=em.getTransaction();
    		transaction.begin();
    		customer1=new Customer();
    		customer1.setCustomerName("Jhon");
    		customer1.setAge(34);
    		customer1.setGender("Male");
    		customer1.setEmailAddress("jhon@hotmail.com");
    		customer1.setMobileNo("9876543210");
    		em.persist(customer1);
    		customer2=new Customer();
    		customer2.setCustomerName("Ric");
    		customer2.setAge(34);
    		customer2.setGender("Male");
    		customer2.setEmailAddress("ric@hotmail.com");
    		customer2.setMobileNo("9876543210");
    		em.persist(customer2);
    		
    		customers=new HashSet<>();
    		customers.add(customer1);
    		customers.add(customer2);
    		
    		loan=new Loan();
    		loan.setTenure(120);
    		loan.setLoanType("Floating");
    		loan.setPrincipleAmount(4500000);
    		loan.setCustomers(customers);
    		loan.setIntrestRate(8.6);
    		
    		em.persist(loan);
    		
    		flag=true;
    	}finally {
    		if(transaction!=null) {
    			if(flag) {
    				transaction.commit();
    			}else {
    				transaction.rollback();
    			}
    		}
    		
    		if(em!=null) {
    			em.close();
    		}
    	}
    	
        System.out.println( "Hello World!" );
    }
}
