package main;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.dto.Domestic;

import OracleMyBatisService.OracleMyBatisService;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleMyBatisService service = new OracleMyBatisService();
//		
//		List<Domestic> list = service.select();
//		for(Domestic dom1 : list) {
//			System.out.println(dom1);
//		}
	
		List<Map<String, Object>> list2 = service.selectAllHash();
		System.out.println(list2.size());
		for(Map<String, Object> m : list2) {
			String no = (BigDecimal)m.get("DEPTNO")+"";
			String dname = (String) m.get("DNAME");
			String loc = (String) m.get("LOC");
			System.out.println(no +"\t"+ dname +"\t"+ loc);
		}
	}
}