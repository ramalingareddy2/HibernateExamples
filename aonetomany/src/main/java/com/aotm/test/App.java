package com.aotm.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.aotm.entities.Enquiry;
import com.aotm.entities.Property;
import com.aotm.helper.EnitityManagerFactoryHelper;

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
    	boolean flag=false;
    	Property property=null;
    	Enquiry enquiry1=null;
    	Enquiry enquiry2=null;
    	Set<Enquiry> enquiries=null;
    	
    	try {
    		emf=EnitityManagerFactoryHelper.getEmf();
    		em=emf.createEntityManager();
//    		transaction=em.getTransaction();
//    		transaction.begin();
//    		
//    		property=new Property();
//    		property.setTitle("2BHK Flat for Sale");
//    		property.setDescription("1250sft Flat is available");
//    		property.setPropertyType("FLAT");
//    		property.setAmount(6000000);
//    		
//    		em.persist(property);
//    		
//    		enquiry1=new Enquiry();
//    		enquiry1.setPersonName("Rosy");
//    		enquiry1.setMobileNo("8907654321");
//    		enquiry1.setEmailAddress("rosy@hotmail.com");
//    		enquiry1.setProperty(property);
//    		
//    		enquiry2=new Enquiry();
//    		enquiry2.setPersonName("Rick");
//    		enquiry2.setMobileNo("98765432210");
//    		enquiry2.setEmailAddress("rosy@hotmail.com");
//    		enquiry2.setProperty(property);
    		
//    		enquiries=new HashSet<>();
//    		enquiries.add(enquiry1);
//    		enquiries.add(enquiry2);
//    		property.setEnquiries(enquiries);
//    		em.persist(property);
//    		em.persist(enquiry1);
//    		em.persist(enquiry2);
    		
    		//Getting Property
    		property=em.find(Property.class, 2);
    		System.out.println("Property-"+property.getTitle());
    		enquiries=property.getEnquiries();
    		for(Enquiry enq:enquiries) {
    			System.out.println("Mobile No-"+enq.getMobileNo());
    		}
    		
    		
    		flag=true;
    	}finally {
    		if(transaction!=null) {
    			if(flag) {
    				transaction.commit();
    			}else {
    				transaction.rollback();
    			}
    		}
    	}
    	
    	
        System.out.println( "Hello World!" );
    }
}
