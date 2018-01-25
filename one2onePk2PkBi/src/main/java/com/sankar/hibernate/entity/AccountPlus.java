package com.sankar.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="ACCOUNT_PLUS")
public class AccountPlus {
	
	@Id
	@GenericGenerator(name = "myGen", strategy = "increment")	
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGen")
	@Column(name="ACCNO")
	private int accno;
	@Column(name="LOCATION")
	private String location;
	@Column(name="TYPE")
	private String type;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Account account;
	
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
