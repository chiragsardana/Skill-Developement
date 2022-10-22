package com.sbk.hibernatejavaproject;

import com.sbk.hibernatejavaproject.dao.EmployeeDao;
import com.sbk.hibernatejavaproject.model.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee(71,"Chirag Sardana","The NorthCap University", 9999, "Chirag@gmail.com");
		EmployeeDao employeeDao = new EmployeeDao();
//		System.out.println(emp);
		employeeDao.create(emp);
		System.out.println("Entry Inserted");
		//Get All Employees
		System.out.println("All Employee in DB is "+employeeDao.read());
		//Get Particular Employee
		System.out.println("Employee Details By ID "+ employeeDao.readById(71));
		//Update Particular Employee
		emp.setAddress("ITM University");
		System.out.println("Updating the Employee ");
//		employeeDao.update(emp);
		System.out.println("Employee Details By ID "+ employeeDao.readById(71));
	}
}
