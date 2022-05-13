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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//트랜젝션처리 
	public void insertDelete(Dept dept, int i ) {
		Connection con= null;
		ArrayList<Dept> list= null;
		try {//con닫기
		 con= DriverManager.getConnection(url, userid, passwd);
con.setAutoCommit(false);  //1. 자동 반영을 false로 변경, 수동으로 처리 (commit, rollback )
		  dao.insert(con, dept);//error 없어서 insert 되게 함 
		  dao.delete(con, i);  //delete시 exception 강제 발생 
con.commit();//커밋
		}catch(SQLException e) {
			if(con !=null)
				try {
					System.out.println("RollBack====================");
con.rollback();//롤백
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			System.out.println(e.getMessage());
		
		}finally {
			if(con!= null)
				try {
con.setAutoCommit(true);// 다시 자동반영으로 변경 
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}
	public ArrayList<Dept> select() throws SQLException{
		Connection con= null;
		ArrayList<Dept> list= null;
		try {//con닫기
		 con= DriverManager.getConnection(url, userid, passwd);
		 list = dao.select(con);		 
		}finally {
			if(con!= null) con.close();
		}
		return list;
	}
	public void insert(Dept xx) {
		Connection con= null;
	
		try {//con닫기
			con= DriverManager.getConnection(url, userid, passwd);
			 dao.insert(con, xx);		 
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
	public void update(Dept xx) throws RecordNotFoundException {
		Connection con= null;
	
		try {//con닫기
			con= DriverManager.getConnection(url, userid, passwd);
			 dao.update(con, xx);		 
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
