import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd = "test";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("매출 조회 메뉴 - [ 매출 일자 순 : 1, 상품별 매출순 : 2]:");
			int menu = scan.nextInt();
			if(menu==1){
//				sql="SELECT TO_CHAR(ODATE, 'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출"
//						+"FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY ODATE ORDER BY 1";
				
				sql="SELECT TO_CHAR(ODATE, 'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출 "
						+"FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY ODATE ORDER BY 1";
			} else if (menu==2){
//				sql="SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출"
//					+"FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY PNAME ORDER BY 2 DESC";
			
				sql = "SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 "
						+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(pid) GROUP BY PNAME ORDER BY 2 DESC";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			System.out.println(((menu==1)?"영업일":"상품명")+"\t\t\t매출");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
		}
			}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

