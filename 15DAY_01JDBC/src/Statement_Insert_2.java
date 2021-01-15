import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Statement_Insert_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.4가지 정보 생성
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";		 
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;				
		//2.드라이버 생성 -> new 이용
		try {
			Class.forName(driver);
			//3.오라클 연결(connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			String dname ="개발";
			String loc = "서울";
			int deptno = 13;
			//4.sql작성
			String sql = "update dept set dname= '"+dname+"',loc='"+loc+"'"+"where deptno="+deptno;
			//단점 작은따옴표를 많이 써야함
			System.out.println(sql);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("실행된 레코드 갯수:"+result);
			
			String sql_delete = "delete from dept where deptno= "+deptno;
			System.out.println(sql_delete);
			int result1 = stmt.executeUpdate(sql_delete);			
			
			String sql1 = "select * from dept";
			rs = stmt.executeQuery(sql1);  //executeQuery : 수행결과로 ResultSet 객체의 값을 반환합니다. SELECT 구문을 수행할 때 사용되는 함수입니다
			System.out.println(sql1);
			while(rs.next()) {
				int deptno1 = rs.getInt("deptno");
				String dname1 = rs.getString("dname");
				String loc1 = rs.getString("loc");
				System.out.println(deptno1+"\t"+dname1+"\t"+loc1);
			}
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
