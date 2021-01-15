import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	
	public JDBC_Method_divide_Test() throws SQLException {   //얘를 NEW 할거임
		//드라이버 로딩 
		//connection 연결 drivermanager.get
		try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, userid, passwd);
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}		 
	
	public String deptAdata(int deptno) throws SQLException {
		//deptno를 select 하기 위한 sql문 작성
		// 한부서의 정보를 string으로 리턴 
		//여기서 드라이버 로딩되면, 다른 함수 있을 경우 또 연결해야하므로 16행으로 이동
		//sql만들고 prepared만들면 크로스 해줘야함 다른데서 다른함수 만들면 다른데서 드라이버 로딩 해줘야함
		//getconnection 해줘야함
		//드라이버 로딩과 커넥션을 어떻게 할지 생각해봐야함
		//커넥션은 사용자가 제일 짧게 갖고있는게 좋음
		//하나 사용하고 바로 끊어지게
		//함수 실행 할 때 마다 커넥션 맺고 쿼리 실행하고 끊어주면 됨.
		String sql = "select * from dept where deptno="+deptno;
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		System.out.println(sql);
		return null;
	}
	public int delAdata(int deptno) {
	
		return 0;
	}
	public static void main(String[] args) {
	   //객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력
		//메인에서 함수 호출 하 다고 크로스 하는 방법이 있음
		
	}

}
