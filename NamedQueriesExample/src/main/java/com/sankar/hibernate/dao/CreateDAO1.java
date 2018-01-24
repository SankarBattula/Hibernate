package com.sankar.hibernate.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.jboss.jandex.Main;

import com.sankar.hibernate.entity.Account;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO1 {
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		/*//Account Object
		Account account = new Account();
		account.setName("Sankar");
		account.setBalance("1000");
		session.save(account);
		session.getTransaction().commit();
		System.out.println("Successfully inserted");*/
		Query query=session.getNamedQuery("findAllAccounts");
		List<Account> accounts = query.list();
		for(Account account : accounts){
			System.out.println(account.getName());
		}
				
	}
}



