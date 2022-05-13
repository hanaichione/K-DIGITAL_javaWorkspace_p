package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXService {
	// 1. 4가지 정보	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	OracleTxDAO dao;
	public OracleTXService() {
		super();
		// TODO Auto-generated constructor stub
		dao= new OracleTxDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Dept> select() throws SQLException{
		Connection con= null;
		ArrayList<Dept> list= null;
		try {		
		 con= DriverManager.getConnection(url, userid, passwd);
		 System.out.println("in service. select() conn ="+ con );
		 list = dao.select(con);		 
		}finally {
			if(con!= null) con.close();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	public int insert(Dept xx) {
		Connection con= null;
		int num=0;
		try {//con닫기
			con= DriverManager.getConnection(url, userid, passwd);
			num= dao.insert(con, xx);		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(con!= null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
		return num;
	 }//end insert 
	
	
	public int update(Dept xx) throws RecordNotFoundException {
		Connection con= null;
		int num=0;
		try {//con닫기
			con= DriverManager.getConnection(url, userid, passwd);
			num= dao.update(con, xx);		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(con!= null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
		return num;
	 }
	
	
	
	public void delete(int i)  {
		Connection con= null;
		
		try {//con닫기
			con= DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(con!= null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}
