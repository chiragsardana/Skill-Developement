package com.sbk.hibernatejavaproject.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sbk.hibernatejavaproject.model.Certification;
import com.sbk.hibernatejavaproject.model.Manager;


public class CertificationDao {
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	/* saving object state into the database */
	public void create() {
		
		Certification c1 = new Certification("Spring Boot", 20);
		Certification c2 = new Certification("FLutter", 90);
		
		Manager mns = new Manager("Chirag", "Sardana", "Chiragsardanasrs@gmail.com");
		
		c1.setManager(mns);
		c2.setManager(mns);
		
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
	
		// step 2: create a transaction boundary
		session.beginTransaction();
		
		// step 3: perform save/insert operation
		session.save(c1);
		session.save(c2);
		
		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
}