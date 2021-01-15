//import java.beans.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JDBCTest4 {
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
//			1. deptno=90의 dname "영업", loc "제주"로 update 후 deptn가 90인 레코드만 select 후 출력
////			String sql1 = "update dept set dname=?, loc=? where deptno=?";
////			pstmt = con.prepareStatement(sql1);
////			pstmt.setString(1, "영업");
////			pstmt.setString(2, "제주");
////			pstmt.setInt(3, 90);
////			int num = pstmt.executeUpdate();
////			System.out.println(num);
//			
//			//2.  dname이 개발 또는 영업인 부서의 deptno출력
////			String sql2 = "select deptno from  dept where dname in(?,?)";
////			pstmt = con.prepareStatement(sql2);
////			pstmt.setString(1, "영업");
////			pstmt.setString(2, "개발");
////			rs = pstmt.executeQuery();
////			System.out.println(sql2);
//			
//			//3. detpno를 기준으로 오름차순 정렬 모든 자료 출력
////			String sql3 = "select * from dept ORDER BY deptno asc";
////			pstmt = con.prepareStatement(sql3);
////			rs = pstmt.executeQuery();
////			System.out.println(sql3);
//			
//			
//			//4. dept테이블 레코드 개수 출력
////			String sql4 = "select count(*) from dept";
////			pstmt=con.prepareStatement(sql4);
////			rs = pstmt.executeQuery();
////			System.out.println(sql4);
////			
////			//5. 부서번호가 20이상인 부서의 지역 출력
////			
////			String sql5 = "select loc from dept where (deptno) > 20 ";
////			pstmt=con.prepareStatement(sql5);
////			rs = pstmt.executeQuery();
////			System.out.println(sql5);
////			
////			//6. 부서이름이 A로 시작하는 부서 이름과 지역 출력
////			String sql6 = "select dname, loc from dept where dname like 'A%'";
////			pstmt=con.prepareStatement(sql6);
////			rs = pstmt.executeQuery();
////			System.out.println(sql6);
////			
////			//7.부서번호가 제일 높은 부서의 이름 출력
////			String sql7 = "select * from dept where deptno = (select max (deptno) from dept)";
////			pstmt=con.prepareStatement(sql7);
////			rs = pstmt.executeQuery();
////			System.out.println(sql7);
//			
//			//8.부서번호 99번 부서 이름 "개발", 지역"서울"추가 후 변경하고 99번부서의 부서번호와 지역을 출력하라.
//			
////			String sql8 ="INSERT INTO dept VALUES (98, '개발', '서울')";
////			pstmt=con.prepareStatement(sql8);
////			int num = pstmt.executeUpdate();
////			System.out.println(num);
//			
//			
////			String sql9 ="update dept set loc = '제주' where deptno = 98";
////			pstmt=con.prepareStatement(sql9);
////			int num1 = pstmt.executeUpdate();
////			System.out.println(num1+"=======");
//			
//			String sql10 ="select deptno, loc from dept where deptno = 98";
//			pstmt=con.prepareStatement(sql10);
//			rs = pstmt.executeQuery();
//			System.out.println(sql10);
////		
////			pstmt=con.prepareStatement(sql9);
////			rs = pstmt.executeQuery();
////			System.out.println(sql9);
////		
////			pstmt=con.prepareStatement(sql10);
////			rs = pstmt.executeQuery();
////			System.out.println(sql10);
////			
//			while (rs.next()) {
////				String dname = rs.getString("dname");
//				String loc = rs.getString("deptno");
//				String deptno = rs.getString("loc");
////				int count = rs.getInt(deptno);
//				System.out.println(loc+deptno);
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
