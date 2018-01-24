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
		/*Account Object
		Account account = new Account();
		account.setName("Sankar");
		account.setCreationDate(new Date());
		account.setBalance("1000");
		session.save(account);
		session.getTransaction().commit();
		System.out.println("Successfully inserted");*/
		
		/*HQL 
		String hqlQuery = "UPDATE Account a SET a.name='Sankar New' WHERE a.balance=1000";
		Query query = session.createQuery(hqlQuery);
		int rowsUpdated = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("No. Of rows updated : " + rowsUpdated ); */
		//Criteria Example 
		/*Criteria criteria = session.createCriteria(Account.class);
		//Name criteria
		Criterion nameCriterion = Restrictions.eq("name", "Sankar New");
		//Balance criteria
		Criterion balanceCriterion = Restrictions.gt("balance", 500);		
		criteria.add(balanceCriterion);
		List<Account> accounts = criteria.list();
		for(Account account : accounts){
			System.out.println(account.getName());
		}*/
		//Native SQL
		String SQL = "SELECT * from ACCOUNT";
		SQLQuery query = session.createSQLQuery(SQL);
		List<Object[]> list = query.list();
		for(Object [] row : list){
			//System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
				
	}
}



