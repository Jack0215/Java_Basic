import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		OracleTxService service = new  OracleTxService();
		ArrayList<Dept> list = service.select();
//		System.out.println(list);
		
		
//		service.insert(new Dept(22,"마케팅","하와이"));
//		
//		try {
//			service.delete(98);
//		} catch (RecordNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			service.update(new Dept(21, "디자인", "제주"));
//		} catch (RecordNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			service.insertDelete(new Dept(24,"마케팅","하와이"), 92);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

