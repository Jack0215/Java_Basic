//import java.beans.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JDBCTestcoding_1 {
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
//			//deptno=90의 dname "영업", loc "제주"로 update 후 deptn가 90인 레코드만 select 후 출력
//			String sql3 = "update dept set dname=?, loc=? where deptno=?";
//			pstmt = con.prepareStatement(sql3);
//			pstmt.setString(1, "영업");
//			pstmt.setString(2, "제주");
//			pstmt.setInt(3, 90);
//			int num = pstmt.executeUpdate();
//			System.out.println(num);
//			
//			String sql4 = "select * from dept";
//			pstmt=con.prepareStatement(sql4);
//			rs = pstmt.executeQuery();
//			System.out.println(sql4);
//			
//			while (rs.next()) {
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				int deptno = rs.getInt("deptno");
//				System.out.println(deptno+"\t"+loc+"\t"+deptno);
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
