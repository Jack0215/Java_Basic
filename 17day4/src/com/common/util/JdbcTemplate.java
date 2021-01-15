
package com.common.util;

import java.sql.*;

public class JdbcTemplate {

	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static String userid = "scott";
	public static String passwd = "tiger";

	public JdbcTemplate() {
		// 드라이버로딩
		Connection conn = null;
		try {
			 Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return;
	}

	/* Connection을 연결한 후 멤버 attribute 인 conn 에 Connection 객체를 세팅한 후 리턴한다.
	 * 
	 * @return Connection*/
	public static Connection getConnection() { // 필요한 BIZ 함수에 CON생성 리턴해줌
		// db연결, 연결된 connection 리턴
		// connect연결 후 tx를 false로 설정 리턴
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
    		con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[JdbcTemplate.getConnection]:" + e.getMessage());
		}
		return con;
	}

	/*DB와 Connect되었는지 여부를 Return 한다.
	  @return DB와 Connect 되었는지 여부. */
	public static boolean isConnected(Connection con) {
		// conn 이 null 이거나 conn.isClose()가 참이면 validConnection을 false 로 설정
		boolean validConnection = true;
		try {
			if (con == null || con.isClosed())
				validConnection = false;
		} catch (SQLException e) {
			validConnection = false;
			e.printStackTrace();
		}
		return validConnection;
	}

	/* Connection 객체를 시스템에 반환한다.
	 * 
	 * @throws SQLException */

	public static void close(Connection con) throws SQLException {
		// conn != null인 경우우 close // isConnected()이용 검사후 close();
		if (con != null)
			con.close();
	}
	/* Statement를 Close 한다.
	 * 
	 * @param stmt Statement 객체. */

	public static void close(PreparedStatement pstmt) {
		// dao에서 pstmt를 넘겨줘서 PreparedStatement를 close() //try-catch 처리
		try {
			if (pstmt != null) 	
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/** ResultSet을 Close 한다.
	 * @param result ResultSet 객체.
	 * @throws SQLException	 */

	public static void close(ResultSet rset) throws SQLException {
		// dao에서 ResultSet을 넘겨줘서 close - try-catch 처리
		if (rset != null)
			rset.close();
	}
	// 지금까지의 트랜잭션을 Commit 처리한다.

	public static void commit(Connection con) {
		try {
			if (isConnected(con)) {
				con.commit();
				System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 지금까지의 트랜잭션을 Rollback 처한다.

	public static void rollback(Connection con) {
		try {
			if (isConnected(con)) {
				con.rollback();
				System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
