package com.amtm.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper {
	
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("hdbpu");

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory emf) {
		EntityManagerFactoryHelper.emf = emf;
	}
	
	
	

}
