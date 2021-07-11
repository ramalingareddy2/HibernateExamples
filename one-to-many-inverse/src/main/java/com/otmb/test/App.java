package com.otmb.test;

import java.util.HashSet;
import java.util.Set;

import com.otmb.dao.StoreDao;
import com.otmb.entities.Staff;
import com.otmb.entities.Store;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	StoreDao dao=new StoreDao();
    	
    	Store store=new Store();
    	store.setStoreName("D-Mart");
    	store.setContactNo("876543210");
    	store.setEmailAddress("contactus@dmart.com");
    	store.setOwnerName("D-MArt");
    	
    	
    	Staff staff1=new Staff();
    	staff1.setAge(23);
    	staff1.setFirstName("Jhon");
    	staff1.setLastName("Brogey");
    	staff1.setGender("Male");
    	staff1.setMobileNo("9876543210");
    	staff1.setStore(store);
    	
    	Staff staff2=new Staff();
    	staff2.setAge(23);
    	staff2.setFirstName("Nicole");
    	staff2.setLastName("Roice");
    	staff2.setGender("Female");
    	staff2.setMobileNo("77863543210");
    	staff2.setStore(store);
    	Set<Staff> staff=new HashSet<>();
    	staff.add(staff1);
    	staff.add(staff2);
    	
    	int Storeno=dao.save(store);
    	System.out.println("StoreNo-"+Storeno);
    	int staffNo1=dao.save(staff1);
    	int staffNo2=dao.save(staff2);
    	
    	System.out.println("StaffNo1-"+staffNo1+"  staffNo2-"+staffNo2);
    	
        System.out.println( "Hello World!" );
    }
}
