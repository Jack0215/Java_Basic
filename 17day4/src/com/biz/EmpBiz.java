package com.biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {
	EmpDAO dao;
	public EmpBiz() {
		//dao생성
		dao = new EmpDAO();
	}

	public  ArrayList<EmpDTO> selectAllEmp() throws SQLException {
		// JdbcTemplate.getConnection()에서 con 얻기
		Connection con = JdbcTemplate.getConnection(); 
		
		// dao.selectAllEmp(con); 호출 conn 전달
			ArrayList<EmpDTO> list = dao.selectAllEmp(con);
	
		// JdbcTemplate 이용 close(con) 으로 커넥션 끊기
			JdbcTemplate.close(con);
		return list;
	}
	
	public EmpDTO selectDetailEmp(String eno) throws DataNotFoundException, SQLException{
	// JdbcTemplate.getConnection()에 con 얻기
		
		Connection con = JdbcTemplate.getConnection();
		//dao.selectDetailEmp(con);호출
		EmpDTO list2 = dao.selectDetailEmp(con, eno);
		//dbcTemplate 이용 close
		JdbcTemplate.close(con);
		return list2;
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
	}
	public void empDelete( String empno) throws DataNotFoundException, SQLException{
		Connection con = null;
		try {
			con = JdbcTemplate.getConnection();
			dao.empDelete(con, empno);
			JdbcTemplate.commit(con);
		} catch (Exception e) {
			JdbcTemplate.rollback(con);
			System.out.println("delete rollack");
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(con);
		}
	}
}
