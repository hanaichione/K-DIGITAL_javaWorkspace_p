import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

import oracle.net.aso.e;

public class OralceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service= new OracleService();
		Dept xx= new Dept(99, "영업","서울");
		int num= service.insert(xx);
		System.out.println("in main num = "+ num );
		int num2= service.delete(99);
		
		
		Dept xx2= new Dept(13, "제경", "부산");
		try {
			int num3=service.update(xx2);
			System.out.println("in main update num = "+ num3 );
		} catch (RecordNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		System.out.println("in main delete num = "+ num2 );
		try {
			//service.select();
			ArrayList<Dept> list= service.select();
			//public ArrayList<Dept> select(){
			// return null; }
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
