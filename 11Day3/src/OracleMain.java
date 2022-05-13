import java.util.HashSet;

import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {
	
		OracleService service = new OracleService();
		HashSet<String> xxx= service.select();
		for (String s : xxx) {
			System.out.println(s);
		}
	}

}
