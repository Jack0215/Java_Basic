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
		System.out.println("실행됩니다.");
		List<Dept>list=null;
		try {
			list =dao.selectAll(session);
		}finally {
			session.close();
		}
		return list; //메인으로가서 세션 클로즈
	}// end class


}
