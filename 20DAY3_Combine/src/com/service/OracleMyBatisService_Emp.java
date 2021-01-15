package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OrcleMyBatisDAO_Emp;
import com.dto.Emp;

public class OracleMyBatisService_Emp {
	
	OrcleMyBatisDAO_Emp dao;
	
	public OracleMyBatisService_Emp() {
		// TODO Auto-generated constructor stub

	dao = new OrcleMyBatisDAO_Emp();
	}
	public List<Emp> select (){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Emp> list = null;
		try {
			list= dao.select(session);
		} finally {
			session.close();
		}
		return list;
	} 
	
	public Emp selectdeptno (int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Emp emp = dao.selectdeptno(session, empno);
		return emp;
		
	}
}
