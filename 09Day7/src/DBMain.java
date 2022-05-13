import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		
//		OracleDAO dao= new OracleDAO();
//		dao.connectOracle();
//		MySQLDAO dao= new MySQLDAO();
//		dao.connectMySQL();
		DBService service = new DBService();
		service.setDAO(new OracleDAO());
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
		
		
	}

}
