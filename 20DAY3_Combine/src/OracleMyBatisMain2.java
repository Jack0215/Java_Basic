import java.util.Arrays;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;
import com.service.OracleMyBatisService_Emp;

public class OracleMyBatisMain2 {

	public static void main(String[] args) throws RecordNotFoundException {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		OracleMyBatisService_Emp serviceEmp = new OracleMyBatisService_Emp();
		
//		List<Dept>depts = Arrays.asList(new Dept(12,"",""), new Dept(13,"",""));
//		service.delete5(depts);
//		
//		Dept dept1 = new Dept(); //주소가 설정되어야함. 걔를 담에서 리스트에 넘길것
//		 dept1.setLoc("제주");
//		Dept dept2 = new Dept();
//		 dept2.setLoc("경기");  //생성하고 설정하고 담았음   생성하고 담고 설정해도 문제없음
//		
//		List<Dept> depts2 = Arrays.asList(dept1, dept2);
		
		//단, service.delete5(depts); 실행 후 생성,설정하면 이미 지워져 있기 때문에 실행이 안됨
		
		
//		Dept dept01 = new Dept(19, "회게", "고속터미널");
//		Dept dept02 = new Dept(22, "경리", "고속터미널");
//		Dept dept03 = new Dept(23, "보안", "고속터미널");
//		List<Dept> list = Arrays.asList(dept01, dept02, dept03);
//		service.multiInsert(list);
		
		List<Dept> deptList3 = service.selectTopN(0,1); //0과3을 top n에 넘겨줌
		for (Dept dept : deptList3) {
			System.out.println(">>>"+dept);
		}
	}
}