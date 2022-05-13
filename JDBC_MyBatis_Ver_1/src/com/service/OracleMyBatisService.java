package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {
	
	OracleMyBatisDAO dao;
	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao= new OracleMyBatisDAO();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Dept> selectAll(){
		SqlSession session= MySqlSessionFactory.getSqlSession();
		//Connect과 sql 사용 함수 가 포함 된 객체 받기 
		List<Dept> list = null;  //ArrayList아닌 List로 받고 있음 
		try {
		 list= dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}













	public Dept selectByDeptno() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Dept d= null;
		try {
			d= dao.selectByDeptno(session);
		} finally {
			session.close();
		}

		return d;
	}
	
	
	
	
	
//	public ArrayList<Dept> select() throws SQLException{
//	
//		ArrayList<Dept> list= null;
//		try {//con닫기
//		 con= DriverManager.getConnection(url, userid, passwd);
//		 list = dao.select();		 
//		}finally {
//		
//		}
//		return list;
//	}
//	public void insert(Dept xx) {
//	
//	
//		try {//con닫기
//	
//			 dao.insert( xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		
//		}		
//	 }
//	public void update(Dept xx) throws RecordNotFoundException {
//		Connection con= null;
//	
//		try {//con닫기
//	
//			 dao.update(con, xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			
//		}		
//	 }
//	public void delete(int i)  {
//	
//		
//		try {//con닫기
//
//			dao.delete(con, i);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//
//		}		
//	}

}
