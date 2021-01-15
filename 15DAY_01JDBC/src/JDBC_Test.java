import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Test {
	public static void main(String[] args) {
		// 0. oracle_jar파일 buildPath에추가
		// 1. 4가지 정보
		// db연동할때 접속이 되어야함 = connection
		// con 연결시킬 때 4가지 정보 필요
		// 오라클용 API 클래스 지정
		// URL : 오라클 접속 주소 @뒤는 내 컴퓨터에 DB에 접속한다는 뜻. 1521 포트로 접속하겠다. orcl = SID
		// ID와 비밀번호
		// connection할 때 위 4가지 정보가 일치해야함.
		String driver = "oracle.jdbc.driver.OracleDriver"; // classnotloading 뜰 경우 이 문장 수정
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // DB Not Connect
		String userid = "scott"; // login denied
		String passwd = "tiger";
		// 2. 드라이버 생성
		// null은 사용 전 준비만 해 놓음
		Connection con = null; // db연결, db connect 객체 = 데이터베이스 실제 접속할 수 있게 해줌
//		PreparedStatement pstmt = null;
		Statement stmt = null; // connect를 이용해 sql명령을 실행하는 객체, sql문을 실제 수행
		ResultSet rs = null; // sql실행 후 select 결과를 저장하는 객체, 테이블에서 레코드 꺼내와서 저장. 이걸 화면에 찍어보면 됨

		try {
			Class.forName(driver); // 여기서 드라이버는 1의 드라이버. 1)1.의 드라이버가 입력되면서 드라이버 로딩이됨
			System.out.println("드라이버 로딩 성공");
			// 2)오라클 연결
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공"); // sql문을 날릴 준비가 끝남
			// 3. SQL 작성
//			String sql = "select deptno x, dname, loc from dept";
			String sql = "select deptno, dname, loc from dept";// Str타입으로 sql변수에 string 적어 줌. sql문에서 세미콜론 제거, db랑 연결된건
																// con이란 변수.
			// 4. SQL 실행 준비 ==> Statement, PreparedStatement 두 객체를 주로 이용
			// 명령 실행 시킬 수 있는
			// connection에서 명령을 실행해줄 Statement 객체를 하나 얻어옴
			stmt = (Statement) con.createStatement();
			// 5. Statement를 이용 실행 select-executeQuery(), DML-executeUpdate()
			rs =  stmt.executeQuery(sql);// Select결과를 ResultSet으로 받음 , 셀렉트문이 날라갔으니 받아와야함
			// 셀렉트한 결과가 rs에 저장됨
			// 6. 실행해서 결과받기
			while (rs.next()) { // 한 레코드의 자료를 컬럼으로 접근해서 출력해줌, 반복하면서 자료가 없을 때까지 출력
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno + "\t" + dname + "\t" + loc); // select한 결과를 화면으로 출력하는게 끝남.
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) { // SQL문 틀리게 적은거 캐치
			e.printStackTrace();
		} finally {
			// 7. 자원반납 반대순서로 실행
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}// end main
}
// end class
