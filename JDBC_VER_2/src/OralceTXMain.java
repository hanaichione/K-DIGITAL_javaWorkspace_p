import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTXService;

public class OralceTXMain {

	public static void main(String[] args) {
		OracleTXService service= new OracleTXService();
		//2번클릭
//				int deptno = 99;
//				String dname="개발";
//				String loc ="제주";
//				Dept xx =new Dept(deptno, dname, loc); 
//				service.insert(xx);
		
		
		//3번 클릭
		Dept xx2 =new Dept(99, "제경", "부산"); 
		try {
			service.update(xx2);
		} catch (RecordNotFoundException e1) {
		System.out.println(e1.getMessage());
		}
		//1번클릭
				try {
					ArrayList<Dept> list= service.select();
					for (Dept dept : list) {
						System.out.println(dept);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		
		
		
		
		
		
		//4번 클릭
		//service.delete(99);

		

		
		
		
		//1번클릭
		try {
			ArrayList<Dept> list= service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
