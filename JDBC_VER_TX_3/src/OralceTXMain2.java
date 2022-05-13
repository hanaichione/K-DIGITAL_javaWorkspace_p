import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTXService;

public class OralceTXMain2 {

	public static void main(String[] args) {
		OracleTXService service= new OracleTXService();
		
		//99번부서 insert , 88번부서 delete
		service.insertDelete(new Dept(99,"개발","제주"), 88);
		//service.insert(new Dept(99,"개발","제주"));
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
