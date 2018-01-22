package com.sankar.hibernate.dao;

import java.io.Serializable;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.jboss.jandex.Main;

import com.sankar.hibernate.entity.User;
import com.sankar.hibernate.util.SessionUtil;

public class CompositeId01 {
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		
		session.getTransaction().begin();
		User user = new User();
		user.setUserId(1001);
		user.setUserName("doe@gmail.com");
		user.setPassword("******");
		user.setProfession("Software Engineer");
		user.setCity("Dechavaram");
		
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Successfully inserted");
		
		
		
		
	}
}



