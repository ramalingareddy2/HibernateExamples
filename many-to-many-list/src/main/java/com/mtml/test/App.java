package com.mtml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mtml.dao.JourneyDao;
import com.mtml.entities.Journey;
import com.mtml.entities.Passenger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JourneyDao journeyDao=new JourneyDao();
    	
//    	Passenger passenger1=new Passenger();
//    	passenger1.setFullName("Rick");
//    	passenger1.setGender("Male");
//    	passenger1.setEmailAddress("rick@hotmail.com");
//    	passenger1.setContactNo("9876543210");
//    	passenger1.setAge(24);
//    	
//    	Passenger passenger2=new Passenger();
//    	passenger2.setFullName("Jhon");
//    	passenger2.setGender("Male");
//    	passenger2.setEmailAddress("jhon@yahoo.com");
//    	passenger2.setContactNo("8796543210");
//    	passenger2.setAge(42);
//    	
//    	int passenderNo1=journeyDao.save(passenger1);
//    	int passengerNo2=journeyDao.save(passenger2);
//    	
//    	System.out.println("Passenger1-"+passenderNo1+"   Passenger2-"+passengerNo2);
//    	
//    	List<Passenger> passengers=new ArrayList<>();
//    	passengers.add(passenger1);
//    	passengers.add(passenger2);
//    	
//    	Journey journey=new Journey();
//    	journey.setSource("Hyderabad");
//    	journey.setDestination("Banglore");
//    	journey.setAmount(1000);
//    	journey.setJourneyDate(new Date());
//    	journey.setPassengers(passengers);
//    	
//    	int journeyNo=journeyDao.save(journey);
//    	
//    	System.out.println("journey Started -"+journeyNo);
    	
    	System.out.println(((Journey)journeyDao.findObject(1, Journey.class)));
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
