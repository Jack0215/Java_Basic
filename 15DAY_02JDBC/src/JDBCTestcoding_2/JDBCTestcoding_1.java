//import java.beans.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JDBCTestcoding_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//		String userid = "scott";
//		String passwd = "tiger";
//
//		// dept와 loc을 바꿀 수 있는 update 코드 작성
//		// dept 90인 애를 부서(dname) 영업 로케이션 제주
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			// dname이 개발 또는 영업인 부서의 deptno출력
//
//			String sql5 = "select deptno from  dept where dname in(?,?)";
//			pstmt = con.prepareStatement(sql5);
//			pstmt.setString(1, "영업");
//			pstmt.setString(2, "개발");
//			rs = pstmt.executeQuery();
//			System.out.println(sql5);
//
//			while (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				System.out.println(deptno);
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (con != null)
//					con.close();
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
