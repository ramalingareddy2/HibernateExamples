package com.otms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Product;
import com.otms.entities.Review;
import com.otms.helper.SessionFactoryRegistry;

public class ProductDao {

	public int saveReview(Review review) {
		int reviewNo = 0;
		boolean isCompleted = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			reviewNo=(int) session.save(review);			
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

		return reviewNo;
	}
	
	public int saveProduct(Product product) {
		int productNo = 0;
		boolean isCompleted = false;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			productNo=(int) session.save(product);			
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

		return productNo;
	}
	
	
	public Review findReview(int reviewNo) {
		Review review=null;
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			review=session.find(Review.class, reviewNo);
		} finally {
			if (session != null)
				session.close();
		}
		return review;
	}

	public Product findProduct(int productNo) {
		Product product=null;
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			product=session.find(Product.class, productNo);
		} finally {
			if (session != null)
				session.close();
		}
		return product;
	}
}
