import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) {
		// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";

		// 2. 드라이버 생성=> new 이용
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			// 3. 오라클 연결( Connection 연결)
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("컨넥션 성공 "+ con);
			// 4. sql 작성
//			String sql = "select deptno x,dname,loc from dept where deptno=?"; // ;제거
		//	String sql = "select deptno x, dname, loc from dept where dname=? and loc=?"; // ;제거
			String sql = "select deptno x, dname, loc from dept where deptno=?"; // ;제거
		//statement sysout 으로 확인 
		//preparedStatement 는 sysout 확인 안됨 
			// 5. SQL 실행==> Statement, PreparedStatement,CallableStatement(PL/SQL)
			pstmt = con.prepareStatement(sql);// ?가진 sql을 포함한 preparedStatement 객체 생성 

			// 6. ? 들어갈 값을 지정 후 실행해서 결과받기
//			pstmt.setString(1,"ACCOUNTING");
//			pstmt.setString(2,"NEW YORK");  // sql완성 
			pstmt.setInt(1, 40);//////////////////////////////
			rs = pstmt.executeQuery();  //select 실행 후 ResultSet으로 결과 받기 

			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
		}

	}// end main
}// end class
