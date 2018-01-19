package com.sankar.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.sankar.hibernate.bean.Account;
import com.sankar.hibernate.util.SessionUtil;

public class AccountDAO {
	
	public void insert(Account account) {
		Session session = null;
		try {
			session = SessionUtil.getSession();
			session.getTransaction().begin();
			session.save(account);
			session.getTransaction().commit();
				
		}catch(HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			SessionUtil.closeSession(session);
		}
	}

}
