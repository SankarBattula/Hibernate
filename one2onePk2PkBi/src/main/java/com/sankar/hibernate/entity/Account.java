package com.sankar.hibernate.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ACCOUNT")
public class Account {
		
	@Id
	@GenericGenerator(name = "myGen",strategy = "increment")						
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGen")
	@Column(name="ACCNO")
	private long accno;
	@Column(name="NAME")
	private String name;
	@Column(name="BALANCE")
	private double balance;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private AccountPlus plus;
	
	public void setPlus(AccountPlus plus) {
		this.plus = plus;
	}
	public AccountPlus getPlus() {
		return plus;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
}
