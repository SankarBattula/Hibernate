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
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = 	GenerationType.AUTO, generator = "myGenerator")
	private  int eno;
	@Column(name="NAME")
	private String name;
	@Column(name="SAL")
	private double salary;
	@Column(name="DESIG")
	private String designation;
	@AttributeOverrides({
		@AttributeOverride(name="houseNumber", column=@Column(name="S_HOUSE_NO")),
		@AttributeOverride(name="street", column=@Column(name="S_STREET")),
		@AttributeOverride(name="city", column=@Column(name="S_CITY"))
	})
	private Address address;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
