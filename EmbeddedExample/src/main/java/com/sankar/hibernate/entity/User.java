package com.sankar.hibernate.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_TAB")
public class User implements Serializable{
	


	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="userId",column=@Column(name="USER_NO")),
		@AttributeOverride(name="username",column=@Column(name="USER_NAME"))
	})
	private UserPK userPK;	
	@Column(name="PASSWORD")
	private String password;
	@Column(name="PROFESSION")
	private String profession;
	@Column(name="CITY")
	private String city;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setUserPK(UserPK userPK) {
		this.userPK = userPK;
	}
	public UserPK getUserPK() {
		return userPK;
	}
	

}
