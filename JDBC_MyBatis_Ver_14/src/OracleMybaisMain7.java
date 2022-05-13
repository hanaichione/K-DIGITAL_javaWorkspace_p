import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain7 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
	
		//5. Top-N 분석 ==>페이징처리
		List<Dept> deptList3 = service.selectTopN("CHICAGO",0,4);
		for (Dept dept : deptList3) {
			System.out.println(">>>" + dept);
		}
		
		
		

	}//end main
}//end class






