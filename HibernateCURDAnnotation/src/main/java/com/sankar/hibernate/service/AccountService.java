package com.sankar.hibernate.service;

import java.util.Date;

import com.sankar.hibernate.bean.Account;
import com.sankar.hibernate.dao.AccountDAO;

public class AccountService {
	
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		
		Account cAccount = new Account();
		cAccount.setAccno(90005);
		cAccount.setName("Sankar");
		cAccount.setBalance(5000);
		cAccount.setCreationDate(new Date());
		dao.insert(cAccount);
		System.out.println("Account Created Successfully..!");
		
		
	}

}
