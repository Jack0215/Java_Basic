package DBMain.copy;
import com.dao.copy.OracleDAO;
import com.dao.copy.DBDAO;
import com.dao.copy.MySQLDAO;
import com.service.copy.DBService;
public class DBMain {

	
	public static void main(String[] args) {
//		DBService service = new DBService();
		DBService service = DBService.getService();
		service.setDAO(new MySQLDAO());
		service.setDAO(new OracleDAO());
		service.insert(new MySQLDAO());
		service.insert(new OracleDAO());
		//마리아 하나 더 추가
		
		///서비스에 insert함수가 추가되게끔
		///main에서 인터와, mysql, oracle 수정
		
	}
}
