package com.sbk.hibernatejavaproject.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sbk.hibernatejavaproject.model.Certification;
import com.sbk.hibernatejavaproject.model.Employee;
import com.sbk.hibernatejavaproject.model.Manager;


public class EmployeeDao {
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	/* saving object state into the database */
	public void create() {
		
		/* Many to Many direction --> A Certification can have many Employees */
		
		Employee tempEmployee1 = new Employee("AYush", "Singh", "AS12@yahoo.com", "Gurugram");
		Employee tempEmployee2 = new Employee("Deepak", "Kumar", "kumardeepak@gmail.com", "Delhi");
		
		Certification tempCertification = new Certification("Intro to Spring Boot", 90);
		
		// adding an Manager to the Certification
		Manager ins = new Manager("Sardana", "Chirag", "CS@ncuindia.edu");
		tempCertification.setManager(ins);
		
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
	
		// step 2: create a transaction boundary
		session.beginTransaction();
		
		// saving the Certification
		session.save(tempCertification);
		
		// adding Employees to the Certification
		tempCertification.addEmployee(tempEmployee1);
		tempCertification.addEmployee(tempEmployee2);
		
		
		// save the Employees
		System.out.println("saving Employees...");
		
		// step 3: perform save/insert operation
		session.save(tempEmployee1);
		session.save(tempEmployee2);
		
		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
}