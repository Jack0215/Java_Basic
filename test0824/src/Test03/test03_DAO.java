package Test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class test03_DAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	Connection con = null;
	PreparedStatement pstmt = null;
	
	public test03_DAO() {
		//드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
		public int insert (DEPT dept ) {
			int num = 0;
			try {
				con =DriverManager.getConnection(url,userid,passwd);
				String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, dept.getDeptno());
				pstmt.setString(2, dept.getDname());
				pstmt.setString(3, dept.getLoc());
				num=pstmt.executeUpdate();
				System.out.println("추가된 갯수 :" + num);
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return num;
		
	}
		
		
		
	}//end OracleDAO

