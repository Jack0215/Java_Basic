package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {
	public ArrayList<EmpDTO> selectAllEmp(Connection con) throws SQLException {
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try { // ┌→ hiredate를 to_char를 이용해 문자로 바꾸는데 to_char안에
				// | hiredate를 'YYYY-MM-DD'형식으로 바꾼다.
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD')hiredate,"
					+ "sal,comm,deptno from emp order by empno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");

				EmpDTO notice = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(notice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// select 후pstmt, resultset을 jdbcTemplate 이용

		finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	// 사원번호로 찾기
	public EmpDTO selectDetailEmp(Connection con, String eno) throws DataNotFoundException, SQLException {
		// select 후 jdbcTemplate 이용 close
		EmpDTO selectDetail = new EmpDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql_detail = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD')hiredate,"
					+ "sal,comm,deptno from emp where empno=? order by empno desc";
			pstmt = con.prepareStatement(sql_detail);
			pstmt.setInt(1, Integer.parseInt(eno));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				selectDetail = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return selectDetail;
	}

	public void empDelete(Connection con, String empno) throws DataNotFoundException {
		// delte 후 jdbcTemplate 이용 close
		
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			String sql_detail = "delete emp where empno=?";
			pstmt = con.prepareStatement(sql_detail);
			pstmt.setInt(1, Integer.parseInt(empno));
			num = pstmt.executeUpdate();
			System.out.println("삭제 자료 갯수:"+num);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}
}
