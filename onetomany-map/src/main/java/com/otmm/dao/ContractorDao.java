package com.otmm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmm.entites.Contractor;
import com.otmm.entites.WorkOrder;
import com.otmm.helper.SessionFactoryRegistry;

public class ContractorDao {
	
	public int saveWorkOrder(WorkOrder workOder) {
		int workOrderNo = 0;
		boolean isCompleted = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			workOrderNo=(int) session.save(workOder);			
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

		return workOrderNo;
	}
	
	public int saveContractor(Contractor contractor) {
		int contractorNo = 0;
		boolean isCompleted = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			contractorNo=(int) session.save(contractor);			
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

		return contractorNo;
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
