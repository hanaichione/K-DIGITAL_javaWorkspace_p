import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
	
		HashMap<String, String> map = new HashMap<String, String>();
		//map.put("loc", "NEW YORK");
		//map.put("dname", "RESEARCH"); //key값을  이용한 검사
		// loc 또는 dname 또는 둘다 없는 경우 
		// select * from dept where dname=#{}
		// where절의 선택적 사용 
		List<Dept> list= service.selectDynamicChoose(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
