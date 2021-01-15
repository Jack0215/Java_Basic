package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.dto.Dept;

public class OracleDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	public OracleDAO() {
		// 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}// end OracleDAO
	public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map){
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "slelct deptno x, dname, loc from dept where dname=? and loc=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, map.get("dname"));
			pstmt.setString(2, map.get("loc"));
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				Dept dto = new Dept(deptno, dname, loc);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
