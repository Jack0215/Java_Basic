package JDBC2_ArrayList;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	private char[] searchDeptByLoc;
	public JDBC_Method_divide_Test() {
		//드라이버 로딩
		try {
		 Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
//	public String search(String loc, String dname) {
//	//지역만 넘어온 경우 지역만 검색 결과 리턴
//	//이름만 넘어온 경우 이름만 검색 결과 리턴
//	//이름, 지역이 넘어온 경우 두 가지를 이용 검색 결과 리턴
//	//두개 받아서 if문으로 검사. 지역만 넘어오면 지역만 셀렉, 이름만 넘어오면 이름만 셀렉, 둘다 넘어오면 둘다. 
//	//&&써서 sql 한문장으로만들것
//	//loc에 널, 스트링 값 존재 or loc 값 존재, 스트링 null
//	}
//	String result = "";
//	try {
//	String sql = "select *from dept where ";
//	if (loc !=null && dname != null) {
//		sql = sql + "loc =? and dname =?";
//		pstmt = con.prepareStatement(sql);
//		pstmt.setString(1, loc);
//		pstmt.setString(2, dname);
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
	
	public ArrayList<DeptDTO> getAllDept(){
		//부서전체 select 
		//결과를 메인으로 리턴 메인에서 전체 데이터 출력 
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();  //string을 담을 수 있는 어레이리스트
		
		//첫번째방 1명 두번째 방 2명 세번 째 방 3명 게속 누적됨. 그러므로 while문 안에 str타입의 result가 추가돼야함.
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_getall = "select * from dept";
			pstmt = con.prepareStatement(sql_getall);
			rs = pstmt.executeQuery();
			while (rs.next()) {
//				String Result = ""; //이 라인이 사라지고 DTO 기본 생성자 생성
				DeptDTO dept = new DeptDTO(); //객체생성
				dept.setDeptno(rs.getInt(1)); //해당되는 번호 설정이 됨
				dept.setDname(rs.getString(2)); //해당되는 번호 설정이 됨
				dept.setLoc(rs.getString(3)); //해당되는 번호 설정이 됨
//				Result += rs.getInt(1);
//				Result += rs.getString(2);
//				Result += rs.getString(3);
//				Result += "\n";
				list.add(dept); //dept 이 전에 Result들어있었음/ 객체생성라인을 str에서   dept dto로변경
				
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				data = deptno+"\t"+dname+"\t"+loc;
//				System.out.println(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;   //<- result가 list로 바뀌어야되고 함수가 str에서 str을 담을 수 있는 어레이리스트로 바껴야됨 그리고 메인으로 이동
	}
		
	
	public String searchDeptByLoc(String loc){
		//주소로 select 
		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
		ArrayList<String> list3 = new ArrayList<String>(); 
		String data = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_search = "select * from dept where  loc=?";
			pstmt = con.prepareStatement(sql_search);
			pstmt.setString(1, loc);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc1 = rs.getString(3);
				data = deptno +"\t"+ dname +"\t"+ loc1+"\n";
				System.out.println(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

	
	
//	public ArrayList<String> searchDeptByName(String dname){
//		//부서이름으로로 select 
//		//부서가 하나 나올수도 있고 여러개 나올 수도 있고 한 부서 당 한 줄 나오게끔 +=??
//		//arraylist나 map에 담아서 할것
//		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
//		
//		ArrayList<String> list2 = new ArrayList<String>();
//		try {
//			con = DriverManager.getConnection(url, userid, passwd);
//			String sql_search = "select * from dept where dname=?";
//			pstmt = con.prepareStatement(sql_search);
//			pstmt.setString(1, dname);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				String data = null;
//				int deptno1 = rs.getInt(1);
//				String dname1 = rs.getString(2);
//				String loc = rs.getString(3);
//				data =  deptno1 + dname1 +loc+"\n";
////				System.out.println(data);
//				list2.add(data);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				pstmt.close();
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return list2;
//	}
	
//	public int updateDept(String dname, String loc, int deptno){
//		//부서번호로 dname, loc업데이트 후 		//업데이트 결과 갯수 리턴
//		int num =0;
//		try {
//			con = DriverManager.getConnection(url, userid, passwd);
//			String sql_update ="update dept set dname=?, loc=? where deptno=?";
//			pstmt = con.prepareStatement(sql_update);
//			pstmt.setString(1, dname);
//			pstmt.setString(2, loc);
//			pstmt.setInt(3, deptno);
//			num = pstmt.executeUpdate();
//		}
//	 catch (SQLException e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			if (rs != null)
//				rs.close();
//			if (pstmt != null)
//				pstmt.close();
//			if (con != null)
//				con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	return num;
//}
	 
	
	
	public int insertDept(String dname, String loc, int deptno){
	//부서하나 추가후 
	//insert 결과 갯수 리턴
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_insert = "insert into dept( dname, loc, deptno)"+" values (?,?,?)";
			pstmt = con.prepareStatement(sql_insert);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			num = pstmt.executeUpdate();
			System.out.println(sql_insert);
			
		}
			catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}
	
	
	
	
//	public String getdeptAdata(int deptno) {
//		//부서번호로 select 
//				//검색 결과가 없을 경우 사용자 정의 Exception 발생(RecordNotFoundException-메세지
//				//찾는 부서 번호가 없습니다.
//				//검색한 내용을 문자열로 리턴
//		String data = "";
//		try { 
//		    con = DriverManager.getConnection(url, userid, passwd);
//		    String sql_getdept = "select * from dept where deptno=?";
//		 	pstmt = con.prepareStatement(sql_getdept);
//		 	pstmt.setInt(1, deptno);
//		 	rs = pstmt.executeQuery();
//		 	while (rs.next()) {
//		 		data += rs.getInt(1);
//		 		data += rs.getString(2);
//		 		data += rs.getString(3);		 		
//		 	}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				pstmt.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return data;
//	}
	
	
	public static void main(String[] args) {
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
//		System.out.println(test.getdeptAdata(29));
//		System.out.println(test.insertDept("서초", "디자인", 29));
//		System.out.println(test.updateDept("서초", "디자", 17));
//		System.out.println(test.searchDeptByName("개발"));
//		System.out.println(test.searchDeptByLoc("서울"));
//		System.out.println(test.getAllDept());
//		System.out.println(test.delAdata(90));	
		//메인쪽에서 객체생성하고 호출 할 때 결과가 스트링이 담겨있는 어레이를 받아야함
//		ArrayList<String> list = test.getAllDept();  //생성 후 아래에서 for문을 이용해 데이터 출력
//		for (String x : list) {		
//			System.out.println(x);
//		ArrayList<String> list2 = test.searchDeptByName("영업");
//		for (String x : list2) {
//			System.out.println(x);
		ArrayList<DeptDTO> list = test.getAllDept();
		for (DeptDTO deptDTO : list) {
			System.out.println(deptDTO.getDname());
					}
		}
	}

