package com.sbk.hibernatejavaproject.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_experiment2")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String fName;
	private String lName;
	private String email;
	private String address;
	@ManyToMany
	@JoinTable(name = "Certification_Employee", 
			joinColumns = @JoinColumn(name = "employee_id"),
			inverseJoinColumns = @JoinColumn(name = "certification_id")
		)
	private List<Certification> certifications;
	
	public Employee(String fName, String lName, String email, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", address="
				+ address + "]";
	}
	
}