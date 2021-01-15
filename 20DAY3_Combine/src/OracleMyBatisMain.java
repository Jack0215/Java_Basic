import java.util.Arrays;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;
import com.service.OracleMyBatisService_Emp;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		OracleMyBatisService_Emp serviceEmp = new OracleMyBatisService_Emp();
//		System.out.println(service.selectByDeptno());

//		System.out.println(service.selectByDeptnoUse(91));

//		List<Dept> dept2 = service.selectByName("개발");
//		System.out.println(dept2);

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
		// select deptno ~~~ between a and b
		// main에서 hashmap 생성 a,b 값 설정 service => dao로 인자로 넘김
		// sql에서 ke를 이용 a,b 값을 설정 (parameterType=hashmap 또는
		// parameterType=java.util.hashmap으로 테스트해보세요.

//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("Key1", 1);
//		map.put("Key2", 50);
//		
//		List<Dept> list = service.selectByHashMap(map);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}

//		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
//		map2.put("Key1", 10);
//		map2.put("Key2", 11);
//		map2.put("Key3", 29);
//		List<Dept>list2 =service.selectBydeptNoIn(map2);
//		for (Dept dept : list2) {
//			System.out.println(dept);
//		}

//		int deptno = 10;
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("deptno", deptno);
//		List<Dept> list2 = service.selectDynamicDeptno(map);
//		for (Dept dept : list2) {
//			System.out.println(dept);
//		}

//		 맵대신에 dept객체가 넘어가게끔
//		Dept dept2 = new Dept();
//		dept2.setDeptno(10);
//		List<Dept> list3 = service.selectDynamicDeptno(dept2);
//		for (Dept dept3 : list3) {
//			System.out.println(dept3);
//		}

//		HashMap<String, String> map2 = new HashMap<String, String>();
//		map2.put("loc", "제주");
//		map2.put("dname", "영업"); //key값을 이용한 검사
//		List<Dept> list4 = service.selectDynamicChoose(map2);
//		
//		for(Dept dept : list4) {
//			System.out.println(dept);
//		}
//		System.out.println(serviceEmp.selectdeptno(9001));
		
//		List<Emp> list = serviceEmp.select();
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		
//		List<Integer> deptnoes = Arrays.asList(12,15,18);
//		List<Dept>list = service.multiSelect(deptnoes);
//		for(Dept dept : list) {
//			System.out.println(dept);
//		}
		
//		List<Integer> deptnoes2 = Arrays.asList(12,15,18);
//		 service.multiUpdate(deptnoes2);
		
		 List<String> delete4 = Arrays.asList("하와이");
		 service.delete4(delete4);
	}
}