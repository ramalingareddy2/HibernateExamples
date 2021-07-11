package com.otml.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otml.entities.Member;
import com.otml.entities.Task;
import com.otml.helper.SessionFactoryRegistry;

public class MemberDao {

	public int saveTask(Task task) {
		int taskNo=0;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean isComplete=false;
		
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			taskNo=(int) session.save(task);
			isComplete=true;
		}catch(Exception e) {
			
		}finally {
			if(transaction!=null) {
				if(isComplete)
					transaction.commit();
				else
					transaction.rollback();
			}
			if(session!=null)
				session.close();
		}
		
		return taskNo;
	}
	
	
	public int saveMember(Member member) {
		int memberNo=0;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean isComplete=false;
		
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			memberNo=(int) session.save(member);
			isComplete=true;
		}catch(Exception e) {
			
		}finally {
			if(transaction!=null) {
				if(isComplete)
					transaction.commit();
				else
					transaction.rollback();
			}
			if(session!=null)
				session.close();
		}
		
		return memberNo;
	}
	
	public Task findTaskById(int taskId) {
		Task task=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			task=session.find(Task.class, taskId);
		}finally {
			if(session!=null)
				session.close();
		}
		return task;
	}
	
	public Member findMemberById(int memberId) {
		Member member=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			member=session.find(Member.class, memberId);
		}finally {
			if(session!=null)
				session.close();
		}
		return member;
	}
	
	
}
