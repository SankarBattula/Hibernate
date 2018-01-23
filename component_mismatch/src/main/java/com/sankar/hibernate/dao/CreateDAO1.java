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

import com.sankar.hibernate.entity.Address;
import com.sankar.hibernate.entity.Employee;
import com.sankar.hibernate.entity.Student;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO1 {
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		
		session.getTransaction().begin();
		//Address Object
		Address address= new Address();
		address.setHouseNumber("153-C");
		address.setStreet("Library road");
		address.setCity("Dechavaram");
		//Employee Object
		Employee employee = new Employee();
		employee.setName("Sankar");
		employee.setDesignation("Software Engineer");
		employee.setSalary(3000);
		employee.setAddress(address);
		//Student Object 
		Student student = new Student();
		student.setName("Sankar");
		student.setCourse("JAVA");
		student.setFee(1000);
		student.setAddress(address);
		
		//Saving entity objects
		session.save(employee);
		session.save(student);
		session.getTransaction().commit();
		System.out.println("Successfully inserted");
				
	}
}



