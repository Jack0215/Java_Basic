import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
//		List<Dept> list = service.selectAll();
//		System.out.println(list);
		

//		System.out.println(service.selectByDeptno());

//		System.out.println(service.selectByDeptnoUse(91));
		
		
//		Dept dept = new Dept();
//		dept.getDname();
		
		List<Dept> list = service.selectByName("개발");
		for(Dept dept2 : list)
		System.out.println(dept2);

//		service.insert(new Dept(24,"마케팅","하와이"));

//		service.delete(92);

//		service.update(new Dept(93, "디자인", "제주"));

//		service.recordCount();		

//		Dept dept = new Dept();
//		dept.setLoc("디자인");
//		dept.setDname("서초");
//
//		List<Dept> dept1 = service.selectByDeptNameAndLoc(dept);
//		for (Dept dept2 : dept1) {
//			System.out.println(dept2);
//		}
		//select deptno ~~~ between a and b
		//main에서 hashmap 생성 a,b 값 설정 service => dao로 인자로 넘김
		//sql에서 ke를 이용 a,b 값을 설정 (parameterType=hashmap 또는
		//parameterType=java.util.hashmap으로 테스트해보세요.
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("Key1", 1);
//		map.put("Key2", 50);
//		
//		List<Dept> list3 = service.selectByHashMap(map);
//		for(Dept dept3 : list) {
//			System.out.println(dept3);
//		}
//		
//		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
//		map2.put("Key1", 10);
//		map2.put("Key2", 11);
//		map2.put("Key3", 29);
//		List<Dept>list2 =service.selectBydeptNoIn(map2);
//		for (Dept dept4 : list2) {
//			System.out.println(dept4);
//		}
	}
}
