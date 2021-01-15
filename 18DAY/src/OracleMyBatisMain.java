import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();  //서비스에 있는 select함수 호출 할 예정
		
		List<Dept> list = service.select();
		
//		System.out.println(list);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}
}
