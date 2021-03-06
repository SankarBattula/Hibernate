package com.sankar.hibernate.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = 	GenerationType.AUTO, generator = "myGenerator")
	@Column(name="SNO")
	private int sno;
	@Column(name="NAME")
	private String name;
	@Column(name="COURSE")
	private String course;
	@Column(name="FEE")
	private double fee;
	@AttributeOverrides({
		@AttributeOverride(name="houseNumber", column=@Column(name="S_HOUSE_NO")),
		@AttributeOverride(name="street", column=@Column(name="S_STREET")),
		@AttributeOverride(name="city", column=@Column(name="S_CITY"))
	})
	private Address address;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
		
}
