package com.sankar.hibernate.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.sankar.hibernate.entity.Student;
import com.sankar.hibernate.entity.Course;
import com.sankar.hibernate.util.SessionUtil;

public class CreateDAO {
	
	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		Course c1 = new Course();
		Course c2 = new Course();
		c1.setCname("HIBERNATE");
		c2.setCname("SPRING");
		
		List<Course> clist = new ArrayList<Course>();
		clist.add(c1);
		clist.add(c2);
		
		Student s1 = new Student();
		s1.setName("Sankar");
		s1.setClist(clist);
		
		Student s2 = new Student();
		s2.setName("Ashok");
		s2.setClist(clist);
		
		session.save(s1);
		session.save(s2);
		
		session.getTransaction().commit();
		System.out.println("Account Created Successfully..!");
				
	}

}
