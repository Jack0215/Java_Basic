import java.util.List;

import com.dto.Emp;
import com.service.OracleMyBatisService_Emp;

//select list처럼 map을 넘겨줌
//emp table에서 selectall 하는거 하나
//empno로 select하는거 하나 두개 함수 프로젝트 새로 써서 만들것.
//emptest package, xml설정도 알아서 해볼것
public class OracleMyBatisMain {
	public static void main(String[] args) {
		OracleMyBatisService_Emp service = new OracleMyBatisService_Emp();
//	List<Emp> list = service.select();
//	for(Emp emp : list) {
//	System.out.println(emp);}

		System.out.println(service.selectdeptno(104));
	}
}
