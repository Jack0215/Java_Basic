import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ASDASD {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public ASDASD () {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getdeptAdata (int deptno) {
		String data = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			data = null;
			while (rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				data = deptno1+dname+loc;
			}
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
