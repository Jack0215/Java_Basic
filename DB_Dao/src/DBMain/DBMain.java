package DBMain;
import com.dao.OracleDAO;
import com.service.DBService;
public class DBMain {

	public static void main(String[] args) {
		DBService service = new DBService();
//		service.setDAO(new MySQLDAO());
		service.setDAO(new OracleDAO()); //로 바뀌면 수정해야할 곳은?
		//mysql 접속을 위해 객체 생성 후 service에 넘김
	}
}
