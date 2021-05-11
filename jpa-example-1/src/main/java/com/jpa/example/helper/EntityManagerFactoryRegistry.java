package com.jpa.example.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	
	private static EntityManagerFactory emf=null;
	static {
		emf=Persistence.createEntityManagerFactory("firstdb");
	}
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEmf() {
		if(emf!=null) {
			emf.close();
		}
	}
	

}
