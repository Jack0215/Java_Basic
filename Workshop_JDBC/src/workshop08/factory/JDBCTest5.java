package workshop08.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;

public class JDBCTest5 {

	public static void main(String[] args) throws SQLException {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "test";
		String passwd = "test";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			Class.forName(driver);
			String sql = "select PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT from product p JOIN store s using ON s.pdno = p.pdno JOIN factory f ON f.factno = p.factno where facname='SEOUL FACTORY'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("제품카테고리 \t 제품명 \t 공장명 \t 판매점명\t 판매점재고수량");
			while (rs.next()) { // 한 레코드의 자료를 컬럼으로 접근해서 출력해줌, 반복하면서 자료가 없을 때까지 출력
				String PDNAME = rs.getString(1);
				String PDSUBNAME = rs.getString(2);
				String FACNAME = rs.getString(3);
				String STONAME = rs.getString(4);
				String STAMOUNT = rs.getString(5);
				System.out.println(PDNAME + "\t" + PDSUBNAME + "\t" + FACNAME+ "\t" + STONAME+ "\t" + STAMOUNT); // select한 결과를 화면으로 출력하는게 끝남.
			}
			System.out.println();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
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
		// end OracleDAO

	}

}
