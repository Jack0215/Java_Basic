package JDBCTestcoding_3;
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
						
			//3. detpno를 기준으로 오름차순 정렬 모든 자료 출력
			String sql3 = "select * from dept ORDER BY deptno asc";
			pstmt = con.prepareStatement(sql3);
			rs = pstmt.executeQuery();
			System.out.println(sql3);
			
			String sql4 = "select * from dept";
			pstmt=con.prepareStatement(sql4);
			rs = pstmt.executeQuery();
			System.out.println(sql4);
			
			while (rs.next()) {
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				int deptno = rs.getInt("deptno");
				System.out.println(deptno+"\t"+loc+"\t"+deptno);
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
