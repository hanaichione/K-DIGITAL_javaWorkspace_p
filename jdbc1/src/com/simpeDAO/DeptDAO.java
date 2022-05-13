package com.simpeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {   //db 접속 sql 실행 
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";

	public DeptDAO() {
		super();
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패 ");
			e.printStackTrace();
		}
	}//end 생성자
	public ArrayList<DeptDTO> selectAllDept() {//전체 레코드 select 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<DeptDTO> list= new ArrayList<>();
		
		try {
		con = DriverManager.getConnection(url, userid, passwd);
		System.out.println("conn연결 성공 "+ con);		
		
		String sql = "select deptno x,dname,loc from dept"; // ;제거
		// 5. SQL 실행==> Statement, PreparedStatement,CallableStatement(PL/SQL)
		pstmt = con.prepareStatement(sql);		

		// 6. 실행해서 결과받기	
		rs = pstmt.executeQuery();		
		while (rs.next()) {			
			int deptno = rs.getInt("x");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
		//	System.out.println(deptno + "\t" + dname + "\t" + loc);
			DeptDTO dto= new DeptDTO(deptno, dname, loc);//dto에 저장
		//	list= new ArrayList<>();   //조심 할것 사용 금지 
			list.add(dto);  // list에 추가 
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 7. 자원반납
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end finally
		
		return list;
	}//end select 
	
	public int insertDept(DeptDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql="insert into dept (deptno,dname,loc)"
					+ " values (?,?,? )"; // ;제거
			
			
			//5. SQL 실행==> Statement, PreparedStatement,CallableStatement(PL/SQL)
			 pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1, dto.getDeptno());
			 pstmt.setString(2,dto.getDname());
			 pstmt.setString(3,dto.getLoc());

			//6. 실행해서 결과받기
			int num= pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
			
}
