package com.sankar.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@GenericGenerator(name = "myGen", strategy = "increment")	
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGen")
	@Column(name="CNO")
	private int cno;
	@Column(name="CNAME")
	private String cname;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
			
}
