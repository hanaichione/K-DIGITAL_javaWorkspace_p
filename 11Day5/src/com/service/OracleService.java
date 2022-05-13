package com.service;

import java.util.Set;

import com.dao.OracleDAO;

public class OracleService {

	OracleDAO dao;
	
	public OracleService() {
		dao  = new OracleDAO();
	}
	
	public Set<String> select() {
		//Set<String> xxx = dao.select();
		return dao.select();
	}
	
}
