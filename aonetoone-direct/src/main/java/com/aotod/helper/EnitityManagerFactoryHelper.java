package com.aotod.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnitityManagerFactoryHelper {
	
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("hdbpu");

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory emf) {
		EnitityManagerFactoryHelper.emf = emf;
	}
	
	
	

}
