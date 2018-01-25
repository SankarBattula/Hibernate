package com.sankar.hibernate.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.sankar.hibernate.entity.Department;
import com.sankar.hibernate.entity.Employee;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO {
	
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		Employee employee1= new Employee();
		employee1.setName("Ashok");
		employee1.setSalary(5000);
		Employee employee2= new Employee();
		employee2.setName("Sanakr");
		employee2.setSalary(2000);
		Employee employee3= new Employee();
		employee3.setName("Vinod");
		employee3.setSalary(3000);
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		
		Department department = new Department();
		department.setName("Software");
		department.setLocation("Hyderabad");
		department.setEmployeeSet(empSet);
		
		session.save(department);
		session.getTransaction().commit();
		System.out.println("Account Created Successfully..!");
				
	}

}
