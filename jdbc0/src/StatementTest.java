import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";   //jdbc 드라이버 이름
		String url="jdbc:oracle:thin:@localhost:1521:xe";  //접속 db정보 127.0.0.1=localhost
		//포트번호, sid= xe
		String userid ="scott";  //계정
		String passwd ="tiger";  //pw		
	 
		Connection con = null;		   //url이용db접속 객체 
		Statement stmt= null;          // 접속 후에 sql실행객체 , Statement, PreparedStatement
		ResultSet rs =null;            //실행된 sql의 결과저장 객체 
		
		try {
			//2. 드라이버 로딩 
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 =====================");
		//3. 오라클 연결( Connection 연결) -접속 성공시 Connection객체 생성 
		 con = DriverManager.getConnection(url, userid, passwd);
		System.out.println("db 접속 성공 : "+  con);
		//4. sql 작성
	//	String sql="select deptno x,dname,loc from dept "; // ;제거
	//	String sql="select * from dept "; // ;제거
		 String name="RESEARCH";
		String sql="select deptno x,dname,loc from dept where dname='"+name+"'"; // ;제거
		
		System.out.println(sql);
		//5. SQL 실행 준비==> Statement, :con에서 실행할 Statement 객체 얻기 
		
		 stmt= con.createStatement();
		//6. Statement를 이용 sql 실행 후  결과를 ResultSet 으로 받기 
		 rs= stmt.executeQuery(sql);	  //select문은 executeQuery함수 이용, 
		 //insert, update, delete는 executeUpdate(sql)함수 이용 
	
		 while(rs.next()) {//다음 레코드가 있을 경우 레코드로 이동			
			 int deptno= rs.getInt(1);    //컬럼이름에 맞게 데이터를 꺼내서 변수에 저장 
			 String dname= rs.getString(2);
			 String loc= rs.getString(3);
//			 int deptno= rs.getInt(1);
//			 String dname= rs.getString(2);
//			 String loc= rs.getString(3);
			 System.out.println(deptno+ "\t"+ dname+ "\t"+ loc);
		 }
		 	}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("드라이버 로딩 실패 ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					//7. 자원반납 반대순서로 실행 
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}//end main
}
// end class
