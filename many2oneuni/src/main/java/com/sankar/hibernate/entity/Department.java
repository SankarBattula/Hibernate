package com.sankar.hibernate.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="DEPT")
public class Department {		
	@Id
	@GenericGenerator(name = "myGen",strategy = "increment")						
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGen")
	@Column(name="DNO")
	private long dno;
	@Column(name="NAME")
	private String name;
	@Column(name="LOC")
	private String location;	
	
	public long getDno() {
		return dno;
	}

	public void setDno(long dno) {
		this.dno = dno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

		
}
