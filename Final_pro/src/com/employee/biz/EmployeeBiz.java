package com.employee.biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
public class EmployeeBiz implements IEmployeeBiz {
	public EmployeeBiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 사원 목록 보기
	@Override
	public List<Employee> selectAllEmployee() {
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();

		try {
			// 리스트에서 사원정보를 읽고
			// 영업인 경우 salse 생성, 리트스에 담아 리턴
			// 엔지니어인 경우 engineer 생성, 리트스에 담아 리턴
			List<HashMap<String, Object>> map = session.selectList("selectAllEmployee"); //sql문을 실행할 메서드를 가져와 Hash맵에 담는다.
			for (HashMap<String, Object> m : map) { //(반복할 객체)map과 변수 m을 설정 
				int empno = ((BigDecimal) m.get("EMPNO")).intValue(); //정확한 값을 얻어오기 위해 BigDecimal 사용
				String ename = (String) m.get("ENAME");
				String hiredate = (String) m.get("HIREDATE");
				String loc = (String) m.get("LOC");
				int sal = ((BigDecimal) m.get("SAL")).intValue();
				String state = (String) m.get("STATE");
				
				if (m.get("DNAME").equals("영업")) { //28라인 실행
					Sales s = new Sales(empno, ename, hiredate, loc, sal, state);
					list.add(s);
				} else {  //29라인 실행
					Engineer eng = new Engineer(empno, ename, hiredate, loc, sal, state);
					list.add(eng);
				}
			}
		} finally {
			session.close();
		}
		return list;
	}
	// 2번 사원정보 검색하기
	@Override
	public List<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		/*
		 * 1.사번 검색 2.이름 검색 3.부서 검색 4.근무지 검색 5.연봉 검색
		 */

		List<Employee> list = new ArrayList<>(); //ArrayList 생성
		SqlSession session = MySqlSessionFactory.getSession(); //jdbc 연동
		/// Map에 inputSubMenu0, searchWord 저장
		try {
			HashMap<String, String> map = new HashMap<String, String>(); // 54라인을 따라 str을 받게 HashMap 생성
			map.put("inputSubMenu", inputSubMenu.trim()); //trim 사용 이유는 빈 칸 입력할까봐
			map.put("searchWord", searchWord.trim()); //2개의 값을 추가한다. 
			System.out.println(inputSubMenu + searchWord+"입력값출력"); //필요없음
			
			/// selectList 시 Map을 넘김, 조건에 맞는 결과를 map을 담은 list로 받기
			/// 영업인 경우 salse 생성, 리트스에 담아 리턴
			/// 엔지니어인 경우 engineer 생성, 리트스에 담아 리턴
			
			List<HashMap<String, Object>> map2 = session.selectList("searchList", map); //sql문과 HashMap을 저장해서 넘겨준다.
			System.out.println(map.size()); //필요없음
			for (HashMap<String, Object> m : map2) {
				int empno = ((BigDecimal) m.get("EMPNO")).intValue();
				String ename = (String) m.get("ENAME");
				String hiredate = (String) m.get("HIREDATE");
				String loc = (String) m.get("LOC");
				int sal = ((BigDecimal) m.get("SAL")).intValue();
				String state = (String) m.get("STATE");
				if (m.get("DNAME").equals("영업")) {
					Sales s = new Sales(empno, ename, hiredate, loc, sal, state);
					list.add(s);
				} else {
					Engineer eng = new Engineer(empno, ename, hiredate, loc, sal, state);
					list.add(eng);
				}
			}
		} catch (Exception e) {
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
		return list;
	}// end printSearchList
	
	//3번 임직원 추가
	@Override
	public int createEmployeeNum() {
		int num = 0;

		SqlSession session = MySqlSessionFactory.getSession();
		try {
		//추가할 사원번호 얻어오기 mapper.createEmployeeNum 호출
			num = session.selectOne("employee.createEmployeeNum"); 
										//employeemapper의 namespace=employee이다.
		} finally {
			session.close();
		}
		return num;
	}

	// 새로운 사원 생성
	@Override
	public void employeeInsert(Employee emp) {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//map에 사원정보 저장
			//영업일 경우 dname추가 
			//사업일경우 일 경우 dname추가 
			//employee.employeeInsert 호출 map넘기기
			//
			HashMap<String, Object> m = new HashMap<>();
			m.put("empno", emp.getEmpno());
			m.put("ename", emp.getEname());
			m.put("hiredate", emp.getHiredate());
			m.put("loc", emp.getLoc());
			m.put("sal", emp.getSal());
			m.put("state", emp.getState());
			if (emp instanceof Sales) {
				m.put("dname", "영업");
			} else {
				m.put("dname", "개발");
			}
			int n= session.insert("employee.employeeInsert", m);
			
			session.commit();
			} finally {
			session.close();
		}
	}
//
}// end class
