package com.sankar.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT")
public class Student {
		
	@Id
	@GenericGenerator(name = "myGen",strategy = "increment")						
	@GeneratedValue(strategy = GenerationType.AUTO,generator="myGen")
	@Column(name="SNO")
	private long sno;
	@Column(name="NAME")
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable( name="STUDENT_COURSE" , joinColumns = {
				@JoinColumn(name="S_NO", referencedColumnName="SNO")},
			inverseJoinColumns = {
				@JoinColumn(name="C_NO", referencedColumnName="CNO")	
			})
	private List<Course> clist;

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getClist() {
		return clist;
	}

	public void setClist(List<Course> clist) {
		this.clist = clist;
	}
	
}
