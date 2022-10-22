package com.sbk.hibernatejavaproject.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "manager_experiment2")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fName;
	private String lName;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_detail", referencedColumnName = "managerId")
	private ManagerDetail managerDetail;
	
	@OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "manager")
	private List<Certification> Certifications;
	
	public Manager() {
		// default constructor
	}
	
	public Manager(String fName, String lName, String email) {
		super();
		//this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	
	
	public List<Certification> getCertifications() {
		return Certifications;
	}


	public void setCertifications(List<Certification> Certifications) {
		this.Certifications = Certifications;
	}


	public ManagerDetail getmanagerDetail() {
		return managerDetail;
	}


	public void setManagerDetail(ManagerDetail managerDetail) {
		this.managerDetail = managerDetail;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "manager [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}
	
	/* added convenience method to sync the bi-directional relationship */ 
	
	  public void addCertifications(Certification certification) 
	  { if (Certifications == null) { 
		  Certifications = new ArrayList<>(); 
		  } 
	  Certifications.add(certification); 
	  certification.setManager(this); }
	
}