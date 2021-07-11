package com.mtmm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.helper.SessionFactoryRegistry;

public class TeamDao {
	
	public int save(Object obj) {
		int id = 0;
		boolean isCompleted = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			id=(int) session.save(obj);			
			isCompleted = true;
		} finally {
			if (transaction != null) {
				if (isCompleted)
					transaction.commit();
				else
					transaction.rollback();
			}

			if (session != null)
				session.close();

		}

		return id;
	}
	
	public Object findObject(int id,Class<?> classType) {
		Object obj=null;
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			obj=session.find(classType, id);
		} finally {
			if (session != null)
				session.close();
		}		
		return obj;
	}

}
