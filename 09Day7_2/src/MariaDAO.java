import com.dao.DBDAO;

public class MariaDAO implements DBDAO {

	@Override
	public void connect() {
		System.out.println("MariaDAO.connect");
	}

}
