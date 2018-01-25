package com.sankar.hibernate.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sankar.hibernate.entity.Account;
import com.sankar.hibernate.util.SessionUtil;

public class NamedQueryTest {
	
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		Query query = session.getNamedQuery("Account.find.allByName");
		query.setParameter("name", "Sankar");
		List<Account> accounts = query.list();
		for(Account account : accounts) {
			System.out.println(account.getName());
		}
		
	}

}
