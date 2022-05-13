import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		HashMap<String, Object> map= service.selectByDeptnoHashMap(10);
		System.out.println(map);//key와 value를 보여줌
		
		
		
		
		
		
	
		Set<String> keys=map.keySet();
		System.out.println(keys);		
		for (String key : keys) {
			System.out.print(key+ ":");
			System.out.print(map.get(key));
			System.out.println();
		}
		
		
		
		System.out.println("========================");
		String loc = (String)map.get("LOC");//형변환 
		System.out.println(loc);
		
		
		
		BigDecimal big= (BigDecimal)map.get("DEPTNO");//소수 , 정수 저장 
		int no= big.intValue();//정수 형 변환 
		System.out.println(no+10);
	
//		int num= service.deptRecordCount();
//		System.out.println("레코드 갯수는 num==="+ num);
//		List<Dept> list= service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
	}

}
