import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver"; // classnotloading 뜰 경우 이 문장 수정
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // DB Not Connect
		String userid = "scott"; // login denied
		String passwd = "tiger";
		
		Connection con = null;  //db에 접속 할 수 있게 해주는 객체
		Statement stmt = null; 	// SQL 실행 객체
		ResultSet rs = null;	//실행 후 select 결과를 저장하는 객체
		
		try {
			Class.forName(driver); //드라이버 로딩
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd); //접속할 url, id, pw 입력
			System.out.println("접속성공");
			String sql =  "select deptno, dname, loc from dept";
			stmt = (Statement)con.createStatement();
			rs = ((Statement)stmt).executeQuery(sql);
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	}
}
