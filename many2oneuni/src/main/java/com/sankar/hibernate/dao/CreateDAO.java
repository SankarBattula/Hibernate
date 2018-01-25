package com.sankar.hibernate.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.sankar.hibernate.entity.Department;
import com.sankar.hibernate.entity.Employee;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO {
	
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		Department department = new Department();
		department.setName("Software");
		department.setLocation("Hyderabad");
		
		Employee employee1= new Employee();
		employee1.setName("Ashok");
		employee1.setSalary(5000);
		employee1.setDepartment(department);
		
		Employee employee2= new Employee();
		employee2.setName("Sanakr");
		employee2.setSalary(2000);
		employee2.setDepartment(department);
		
		Employee employee3= new Employee();
		employee3.setName("Vinod");
		employee3.setSalary(3000);
		employee3.setDepartment(department);
				
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		
		session.getTransaction().commit();
		System.out.println("Account Created Successfully..!");
				
	}

}
