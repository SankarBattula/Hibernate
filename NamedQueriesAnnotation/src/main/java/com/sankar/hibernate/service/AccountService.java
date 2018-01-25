package com.sankar.hibernate.service;

import java.util.Date;

import org.hibernate.Session;

import com.sankar.hibernate.entity.Account;
import com.sankar.hibernate.util.SessionUtil;

public class AccountService {
	
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		Account account = new Account();
		account.setName("Sankar");
		account.setBalance(5000);
		session.save(account);
		session.getTransaction().commit();
		System.out.println("Account Created Successfully..!");
		
		
	}

}
