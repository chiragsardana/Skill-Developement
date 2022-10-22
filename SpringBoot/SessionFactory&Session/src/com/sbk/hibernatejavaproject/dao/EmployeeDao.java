package com.sbk.hibernatejavaproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sbk.hibernatejavaproject.model.Employee;

public class EmployeeDao {
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
//	Link For Reference between save(), saveOrUpdate() and persist(). 
//	https://www.java67.com/2016/01/difference-between-save-saveorupdate-and-persist-in-Hibernate.html
	
//	Saving Employee Object in Database
	public void create(Employee employee) {
		Transaction transaction = null;
		try(Session session = sessionFactory.openSession()){
			//Start the transaction
			transaction = session.beginTransaction();
			
			//Save the Employee Object
			session.save(employee);
			
			//Commit the transaction
			transaction.commit();
		}catch(Exception e) {
			System.out.println("Eroor");
			System.out.println(e.toString());
			if(transaction != null) {
				transaction.rollback();
			}
			
		}finally {
		
		}
	}
	public List<Employee> read() {
		Transaction transaction = null;
		List<Employee> employees = null;
		try(Session session = sessionFactory.openSession()){
			//Start the transaction
			transaction = session.beginTransaction();
			
			//Save the Employee Object
			employees = session.createQuery("from Employee").list();
			
			//Commit the transaction
			transaction.commit();
		}catch(Exception e) {
			System.out.println("Error is "+e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return employees;
	}
	public Employee readById(int id) {
		Transaction transaction = null;
		Employee employee = null;
		try(Session session = sessionFactory.openSession()){
			//Start the transaction
			transaction = session.beginTransaction();
			
			//Save the Employee Object
			employee = session.get(Employee.class, id);
			
			//Commit the transaction
			transaction.commit();
		}catch(Exception e) {
			System.out.println("Error is "+e);
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return employee;
	}
	public void update(Employee employee) {
		Transaction transaction = null;
		try(Session session = sessionFactory.openSession()){
			//Start the transaction
			transaction = session.beginTransaction();
			
			//Save the Employee Object
			session.saveOrUpdate(employee);
			
			//Commit the transaction
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	}
	public void delete() {
		
	}
}
