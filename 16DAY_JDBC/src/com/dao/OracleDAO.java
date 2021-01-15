package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public OracleDAO() {
		//드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}//end OracleDAO
	
	public ArrayList<Dept> select()throws SQLException {
		//전체 데이터 리턴 출력
		//dept테이블 전체 select dept 객체로 생성 arraylist에 add 후
		//service로 리턴 service에서는 다시 메인으로 리턴, 메인에서 출력
		//메인 -> service.select() -> dao.select() 호출
		//메인에서 전체 데이터 출력
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
//				Dept dto = new Dept(deptno, dname, loc);
				list.add(dept);
			}
				
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return list;
	}//end select
	public void insert() {}	
	public void update() {}
	public void delete() {}
	
}



