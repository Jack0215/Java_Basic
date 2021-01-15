package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO();
	}
	
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		System.out.println("실행1");
		List<Dept> list = null;
		try{
			dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;		
	}// end class
	
	public Dept selectByDeptno() {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept dept = null;
		try {
		 dept = dao.selectByDeptno(session);
		} finally {
			session.close();
		}
		return dept;
	}
	
	public Dept selectByDeptnoUse(int i) {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept num = null;
		try {
			num=dao.selectByDeptnoUse(session, i);
		} finally {
			session.close();
		} return num;
	}

}
