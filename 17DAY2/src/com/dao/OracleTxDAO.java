package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {

	ResultSet rs = null;
	PreparedStatement pstmt = null;	

	public void update(Connection con, Dept xx) throws RecordNotFoundException {

		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql_update ="update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql_update);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			num = pstmt.executeUpdate();
			System.out.println(num);
			if(num==0) {
				throw new RecordNotFoundException("업데이트 할 자료가 없습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
//				if (rs != null)
//					rs.close();
				if (pstmt != null)
					pstmt.close();
//				if (con != null)
//					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end upate

	public void delete(Connection con, int i) {
		int num = 0;
		PreparedStatement pstmt = null;
		
		try {
//			PreparedStatement pstmt = null;
			String sql_delete = "delete from dept where dept=?";
			pstmt = con.prepareStatement(sql_delete);
			pstmt.setInt(1, i);
			num = pstmt.executeUpdate();
			System.out.println(num);
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("rollback 발생");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert(Connection con, Dept xx) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
//			PreparedStatement pstmt = null;
			String sql_insert = "insert into dept( dname, loc, deptno)" + " values (?,?,?)";
			pstmt = con.prepareStatement(sql_insert);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			num = pstmt.executeUpdate();
			System.out.println(num);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end insert

	public ArrayList<Dept> select(Connection con) throws SQLException { //컨넥션받아서 sql만들고 pstmt만들어주고 쿼리 날려주고 결과를 갖다가 리스트에 담음.
																		//한 레코드당  ㅇ뎃 객체 하나씩 만들어주고 리스트에 추가 //셀렉트한 결과가 없으면 list size=0 해서 익셉션 발생
		// 커넥션이 있어야 pstmt사용
		// 커넥션맺는게 빠지고 받아서 사용, 커넥션은 서비스클래스에서 생성
		// conn사용
		// sql만들고 사용했던 pstmt나 rs만 close
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select deptno, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3)+"\n");
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// end select
}
