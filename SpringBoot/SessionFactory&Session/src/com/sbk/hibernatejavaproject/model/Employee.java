package com.sbk.hibernatejavaproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="emp_no", nullable = false)
	private int empNo;
	@Column(name="emp_name", nullable = false, length = 30)
	private String empName;
	@Column(name="emp_address", nullable = false)
	private String address;
	@Column(name="emp_salary", nullable = false)
	private int salary;
	@Column(name="emp_email", nullable = false, unique = true)
	private String email;
	
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, String address, int salary, String email) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
		this.email = email;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				+ ", email=" + email + "]";
	}
	
}
