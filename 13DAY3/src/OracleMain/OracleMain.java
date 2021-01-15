package OracleMain;

import java.util.HashSet;

import com.dao.Person;

import OracleService.OracleService;

public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 DAO는 String을 갖고있는데
		//person new x3 해서 가져올것
		//person클래스 가져와야함,
		OracleService service = new OracleService();
		HashSet<Person> xxx= service.select();  //DAO에서 내용이 담겨있는 서비스를 받아오고, 서비스에서 XXX
		for(Person s : xxx) {					//
			System.out.println(s);
		}
	}

}
