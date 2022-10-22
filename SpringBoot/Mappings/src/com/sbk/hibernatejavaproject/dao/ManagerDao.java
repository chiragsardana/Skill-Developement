package com.sbk.hibernatejavaproject.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sbk.hibernatejavaproject.model.Certification;
import com.sbk.hibernatejavaproject.model.Manager;
import com.sbk.hibernatejavaproject.model.ManagerDetail;



public class ManagerDao {
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	/* saving object state into the database */
	public void create() {
		
		Manager mns = new Manager("Chirag", "Sardana", "Chirag19CSU071@ncuindia.edu");
		
		ManagerDetail mns_detail = new ManagerDetail("https://sardana-boy-kanu.web.app/", "Sirsa");
		
		mns.setManagerDetail(mns_detail);
		
		Certification c1 = new Certification("C Programming", 10);
		Certification c2 = new Certification("Android Development", 50);
		Certification c3 = new Certification("Business Analytics", 25);
		  mns.addCertifications(c1); mns.addCertifications(c2); mns.addCertifications(c3);
		
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
		// step 2: create a transaction boundary
		session.beginTransaction();
		// step 3: perform save/insert operation
		session.save(mns);
		// step 4: commit the transaction
		session.getTransaction().commit();
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
	
	
	public void read() {
		
		int id = 19;
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();

		// step 2: create a transaction boundary
		session.beginTransaction();

		// step 3: fetch the Manager with id = 6
		Manager i = session.get(Manager.class, id);
		if (i == null) {
			System.out.println("Manager doesn't exists!");
		} else {
			System.out.println("Manager found: "+i);
			System.out.println("Certifications mapped with Manager with given id are: ");
			List<Certification> certifications = i.getCertifications();
			for(Certification c : certifications) {
				System.out.println(c);
			}
		}

		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Operation completed succcessfully!!");
		
	}

}