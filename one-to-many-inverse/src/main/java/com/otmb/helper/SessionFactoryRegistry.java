package com.otmb.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import lombok.Data;
@Data
public class SessionFactoryRegistry {
	
	private static SessionFactory sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().enableAutoClose().build()).buildMetadata().buildSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	
}
