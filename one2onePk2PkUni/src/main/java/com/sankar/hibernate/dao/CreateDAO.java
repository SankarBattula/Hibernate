package com.sankar.hibernate.dao;

import java.util.Date;

import org.hibernate.Session;

import com.sankar.hibernate.entity.Account;
import com.sankar.hibernate.entity.AccountPlus;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO {
	
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		AccountPlus accountPlus= new AccountPlus();
		accountPlus.setLocation("Hyderabad");
		accountPlus.setType("savings");
		Account account = new Account();
		account.setName("Sankar");
		account.setBalance(5000);
		account.setPlus(accountPlus);
		session.save(account);
		session.getTransaction().commit();
		System.out.println("Account Created Successfully..!");
				
	}

}
