package com.service;

import com.dao.DBDAO;

public class DBService {

	public void setDAO(DBDAO dao) {
		dao.connect();
	}
}
