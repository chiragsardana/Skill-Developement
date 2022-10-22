package com.sbk.hibernatejavaproject.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "manager_detail_experiment2")
public class ManagerDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerId;
	private String managerProfile;
	private String address;
	public ManagerDetail() {}
	public ManagerDetail( String managerProfile, String address) {
		super();
		this.managerProfile = managerProfile;
		this.address = address;
	}
	public int getInstructorId() {
		return managerId;
	}
	public void setInstructorId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerProfile() {
		return managerProfile;
	}
	public void setManagerProfile(String managerProfile) {
		this.managerProfile = managerProfile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ManagerDetail [ManagerId=" + managerId + ", managerProfile=" + managerProfile + ", address=" + address
				+ "]";
	}	
}