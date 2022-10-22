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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Certification_experiment2")
public class Certification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String certificationName;
	private int duration;
	@ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinColumn(name = "Manager_id")
	private Manager manager;
	
	@ManyToMany
	@JoinTable(name = "Certification_Employee", 
				joinColumns = @JoinColumn(name = "certification_id"),
				inverseJoinColumns = @JoinColumn(name = "employee_id")
			)
	private List<Employee> employees;
	
	public Certification() {
		// default constructor
	}
	
	public Certification(String certificationName, int duration) {
		super();
		this.certificationName = certificationName;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCertificationName() {
		return certificationName;
	}
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// add a convenience method
	public void addEmployee(Employee theEmployee) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
		employees.add(theEmployee);
	}
	
	@Override
	public String toString() {
		return "Certification [cid=" + cid + ", CertificationName=" + certificationName + ", duration=" + duration + "]";
	}
	
}