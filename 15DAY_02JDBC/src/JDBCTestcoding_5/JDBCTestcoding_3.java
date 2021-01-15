package JDBCTestcoding_5;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTestcoding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
						
//5. 부서번호가 20이상인 부서의 지역 출력
			
			String sql5 = "select loc from dept where (deptno) > 20 ";
			pstmt=con.prepareStatement(sql5);
			rs = pstmt.executeQuery();
			System.out.println(sql5);
			while (rs.next()) {
//				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				String deptno = rs.getString("deptno");
//				int count = rs.getInt(deptno);
				System.out.println(loc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

