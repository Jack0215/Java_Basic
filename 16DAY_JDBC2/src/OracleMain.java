import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;
//서비스에 있는 함수를 한번 호출하면 DAO에있는 함수를 여러번 호출하게만들면 여기서 여러번 안불러도 됨
//나중에 트랜잭션 한번에 처리하기위해
//나중에 서비스도 커낵션에서 만들어줌

//흐름 ->메인에서는 셀렉트 (오라클서비스에있는), 서비스에는 dao에있는 셀렉트 함수 호출/dao return타입 어레이 
//서비스 셀렉트는 dao에서 어레이스트 받아오고 메인으로 리턴
//메인은 어레이스트 받아서 출력
//메인 
public class OracleMain {

	public static void main(String[] args) throws RecordNotFoundException, SQLException {

		OracleService service = new OracleService();
		
		try {
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		service.insert(new Dept(93, "제조","경기"));  //전체데이터 출력
		
//		service.update(new Dept(22, "디자인", "제주")); 
		
//		service.delete(19);
		
//		service.selectbydeptnoDepts(20);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("dname", "영업"); //key = name, value = 영업
		map.put("loc", "제주");  //key = loc, value = 제주
		try {
			ArrayList <Dept> list = service.selectByNameLoc(map);
			for( Dept dept : list) {
				System.out.println(dept);
				System.out.println("asdasasd");
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}