package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();
	}

//===================================동적sql---==============
	// 검색할 deptno를 맵에서 받음. where이 없으면 셀렉해서 객체, where이 붙으면 해당되는 사람 1명만 받아오는 작업
	public List<Dept> selectDynamicDeptno(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, map);
		} finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicDeptno(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, dept);
		} finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicChoose(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicChoose(session, map);
		} finally {
			session.close();
		}
		return list;
	}
	// 멀티 셀렉트

	public List<Dept> multiSelect(List<Integer> deptnoes) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.multiSelect(session, deptnoes);
		} finally {
			session.close();
		}
		return list;
	}

	public void multiUpdate(List<Integer> deptnoes2) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiUpdate(session, deptnoes2);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void delete4(List<String> loc) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete4(session, loc);
			session.commit();
		} finally {
	session.close();
	}

	}

	public void delete5(List<Dept> depts) {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete5(session, depts);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void multiInsert (List<Dept> depts) {
		//list에 insert할 dept 객체를 3개 담고 dao넘김
		//mapper.xml에서 insert all sql 문 실행 3개를 dept 테이블에 insert
		//dao에서 insert 갯수 출력
		//아래쪽 셀렉트를 아무 테이블이나 해도 상관없음
		//sql할때 썼던 더미 테이블
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiInsert(session, depts);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	public List<Dept> selectTopN (int i, int j){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list=dao.selectTopN(session,i,j);
		}finally {
			session.close();
		}
		return list;
	}
}