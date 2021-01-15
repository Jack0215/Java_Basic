package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

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

	public ArrayList<Dept> select() throws SQLException {
		// 전체 데이터 리턴 출력
		// dept테이블 전체 select dept 객체로 생성 arraylist에 add 후
		// service로 리턴 service에서는 다시 메인으로 리턴, 메인에서 출력
		// 메인 -> service.select() -> dao.select() 호출
		// 메인에서 전체 데이터 출력
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
//				Dept dto = new Dept(deptno, dname, loc);
				list.add(dept);
			}

		} catch (SQLException e) {
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
	}// end select

	public void insert(Dept dept) { // dept받아서 DB에 insert 후 갯수 출력
		// 메인에서는 service의 insert부를것
		// public void insert(Dept dept) {} 복사해서 service에 입력
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_insert = "insert into dept( dname, loc, deptno)" + " values (?,?,?)";
			pstmt = con.prepareStatement(sql_insert);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			num = pstmt.executeUpdate();
			System.out.println(num);
		} catch (SQLException e) {
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
	}

	public void update(Dept dept) throws RecordNotFoundException{
	//throws enw rec
		//num = 0 이면 실행이 안된것
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_update ="update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql_update);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			num = pstmt.executeUpdate();
			System.out.println(num);
			if(num==0) {
				throw new RecordNotFoundException("업데이트 할 자료가 없습니다.");
			}
		}catch (SQLException e) {
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
	}

	public void delete(int deptno) throws RecordNotFoundException {
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql_update ="delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql_update);
			pstmt.setInt(1, deptno);
			num = pstmt.executeUpdate();
			System.out.println(num);
			if(num==0) {
				throw new RecordNotFoundException("삭제할 자료가 없습니다.");
			}
		}catch (SQLException e) {
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
	}
	
	public ArrayList<Dept> selectbydeptno(int deptno) throws SQLException {
		// 
		// deptno가 없으면 recordnotfoundation 발생
		// 리턴타입은 어레이리스트 or dept? deptno?
		ArrayList<Dept> list = new ArrayList<Dept>();
		Dept dept = null;
		try {
			
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select dname, deptno, loc from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				dept = new Dept();
				dept.setDname(rs.getString(1));
				dept.setDeptno(rs.getInt(2));
				dept.setLoc(rs.getString(3));
				list.add(dept);
				System.out.println(list);
				
			} 

		} catch (SQLException e) {
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
		if(dept == null) {
			System.out.println("출력값이 없습니다.");
		}
		return list;
	}
		
		public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map){
			ArrayList<Dept> list = new ArrayList<Dept>();
				//메인에서 map에 키 "name"-"개발", "loc"-"제주"로 넘김
		//value 만 꺼내서 select, 결과를 ArrayList에 담아서 리턴
		//레코드가 없는 경우 "검색할 자료가 없습니다." Exception 발생
			Connection con = null;
			ResultSet rs = null;
			PreparedStatement pstmt = null;
			try
			{
				con = DriverManager.getConnection(url, userid, passwd);
				String sql ="select dtno x, dname, loc from dept where dname=? and loc=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, map.get("dname"));
				pstmt.setString(2, map.get("loc"));
			
				rs= pstmt.executeQuery();
				while(rs.next()) {
					int deptno =rs.getInt("x");
					String dname = rs.getString(2);
					String loc = rs.getString("loc");
					Dept dto = new Dept(deptno, dname, loc);
					list.add(dto);
				}
			}
			 catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		
	}// end select
}
