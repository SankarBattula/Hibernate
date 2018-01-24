package com.sankar.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ACCOUNT")
public class Account {
	
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = 	GenerationType.AUTO, generator = "myGenerator")
	@Column(name="ACCNO")
	private int accountId;
	@Column(name="NAME")
	private String name;
	@Column(name="BALANCE")
	private String balance;
	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DT",nullable=false)
	private Date creationDate;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	
	
	
}
