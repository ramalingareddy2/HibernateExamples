package com.jpa.annotations.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("firstjpa");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void closeEntityManagerFactory() {
		if(entityManagerFactory!=null) {
			entityManagerFactory.close();
		}
		
	}
	
	

}
