package com.jpa.example.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {

	private static SessionFactory sessionFactory;
	/*
	 * static { Configuration configuration = new Configuration();
	 * StandardServiceRegistryBuilder builder = new
	 * StandardServiceRegistryBuilder().configure(); StandardServiceRegistry
	 * registry = builder.build(); sessionFactory =
	 * configuration.buildSessionFactory(registry); }
	 */

	static {
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().configure();
		// addInitiator
		StandardServiceRegistry registry = builder.build();
		MetadataSources metadataSources = new MetadataSources(registry);
		MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
		Metadata metadata = metadataBuilder.build();
		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
		sessionFactoryBuilder.applyAutoClosing(true);
		sessionFactory = sessionFactoryBuilder.build();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
