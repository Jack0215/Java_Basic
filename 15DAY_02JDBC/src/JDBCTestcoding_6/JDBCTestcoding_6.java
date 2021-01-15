package JDBCTestcoding_6;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTestcoding_6 {

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
						
			//6. 부서이름이 A로 시작하는 부서 이름과 지역 출력
			String sql6 = "select dname, loc from dept where dname like 'A%'";
			pstmt=con.prepareStatement(sql6);
			rs = pstmt.executeQuery();
			System.out.println(sql6);
			
			
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

