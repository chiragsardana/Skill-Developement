package com.sbk.hibernatejavaproject;

import com.sbk.hibernatejavaproject.dao.CertificationDao;
import com.sbk.hibernatejavaproject.dao.EmployeeDao;
import com.sbk.hibernatejavaproject.dao.ManagerDao;
import com.sbk.hibernatejavaproject.model.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		ManagerDao mnsDao = new ManagerDao(); 
		CertificationDao dao = new CertificationDao();
		EmployeeDao empDao = new EmployeeDao(); 
		dao.create();
		mnsDao.create();
		mnsDao.read();
		empDao.create();
	}
}
