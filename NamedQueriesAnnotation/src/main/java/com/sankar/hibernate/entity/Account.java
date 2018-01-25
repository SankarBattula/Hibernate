package com.sankar.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@NamedQueries({
	@NamedQuery(name="Account.find.all",query="FROM Account"),
	@NamedQuery(name="Account.find.allByName",query="FROM Account a WHERE a.name=:name")
})
@Entity
@Table(name="ACCOUNT")
public class Account {
	
	
	@Id
	@GenericGenerator(name="myGen" , strategy="increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator ="myGen")
	@Column(name="ACCNO")
	private long accno;
	@Column(name="NAME")
	private String name;
	@Column(name="BALANCE")
	private double balance;
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
