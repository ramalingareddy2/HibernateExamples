package com.mtml.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistery {
	
	private static SessionFactory sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().enableAutoClose().build()).buildMetadata().buildSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	

}
