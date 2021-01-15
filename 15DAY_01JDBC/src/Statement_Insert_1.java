import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.DocFlavor.STRING;

public class Statement_Insert_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver); //JDBC 드라이버 로드
			con = DriverManager.getConnection(url, userid, passwd); //SQL 연결
			int deptno = 90;
			String deptname = "개발";
			String loc = "서울";
			String sql ="insert into dept (deptno,dname,loc)"+ 
			"values("+deptno+",'"+deptname+"','"+loc+"')"; 		//deptno는 작은따옴표 필요없음
			//deptname은 문자열이라 작은 따옴표로 묶여야됨 ,'"+deptname+"'
			System.out.println(sql);	
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("실행된 레코드 갯수:"+result);
//=============================================================================================
			//다시 한번 셀렉트 해서 출력? DEPT TABLE에 들어갔는지 출력
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

