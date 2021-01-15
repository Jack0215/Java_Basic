package OrcleMain;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.dto.Dept;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service = new OracleService();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("dname", "영업");
		map.put("loc", "제주");
		try {
			ArrayList<Dept> list = service.selectByNameLoc(map);
			for(Dept dept : list) {
				System.out.println(dept);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
