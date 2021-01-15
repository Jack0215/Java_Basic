import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql2 = "insert into dept(deptno, dname, loc)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql2);
			// 단점 sql문을 출력해서 중간점검이 불가능하다.
			pstmt.setInt(1, 13);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			int num = pstmt.executeUpdate(); //insert문이라  executeUpdate로 실행
			System.out.println("실행된 레코드 갯수:" + num);
			//where문 넣어서 추가시킨 정보만 출력
			String sql_total = "select * from dept where deptno=13";
			
			
			pstmt=con.prepareStatement(sql_total);
			rs= pstmt.executeQuery(sql_total);
			System.out.println(sql_total);
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
