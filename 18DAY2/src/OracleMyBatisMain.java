import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
//		List<Dept> list = service.select();
//		System.out.println(list);
		
//		System.out.println(service.selectByDeptno());
		
		System.out.println(service.selectByDeptnoUse(91));
	}
	
}
