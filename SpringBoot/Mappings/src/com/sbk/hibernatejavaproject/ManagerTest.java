package com.sbk.hibernatejavaproject;

import com.sbk.hibernatejavaproject.dao.CertificationDao;
import com.sbk.hibernatejavaproject.dao.ManagerDao;

public class ManagerTest {

	public static void main(String[] args) {
		 ManagerDao insDao = new ManagerDao(); 
		CertificationDao dao = new CertificationDao();
		dao.create();
		insDao.create();

	}

}