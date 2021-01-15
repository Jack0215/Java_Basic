import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();

//		System.out.println(service.selectByDeptno(55));

//		System.out.println(service.selectByDeptnoUse(91));

		List<Dept> dept2 = service.selectByName("개발");
		for (Dept dept : dept2) {
		System.out.println(dept);
		}

//		service.insert(new Dept(24,"마케팅","하와이"));

//		service.delete(92);

//		service.update(new Dept(93, "디자인", "제주"));

//		service.recordCount();		

		Dept dept = new Dept();
		
//		dept.setLoc("디자인");
//		dept.setDname("서초");
//
		List<Dept> dept1 = service.selectByDeptNameAndLoc(dept);
		for (Dept dept21 : dept1) {
			System.out.println(dept21);
		}
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
		// 맵대신에 dept객체가 넘어가게끔
//		Dept dept2 = new Dept();
//		dept2.setDeptno(10);
//		List<Dept> list2 = service.selectDynamicDeptno2(dept2);
//		for (Dept dept3 : list2) {
//			System.out.println(dept3);
//		}
	}

}
