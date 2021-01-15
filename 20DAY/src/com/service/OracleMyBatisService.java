package com.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();

	}

	public List<Dept> selectByDeptNameAndLoc(Dept dept) {

		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByDeptNameAndLoc(session, dept);
		} finally {
			session.close();
		}
		return list;
	}

	public void delete(int deptno) {

		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void update(Dept dept) throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Dept dept = null;
		try {
			dept = dao.selectByDeptno(session, deptno);
		} finally {
			session.close();
		}
		return dept;
	}

	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();// 명시적으로 꼭 해주어야 함.
		} finally {
			session.close();
		}
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}

	public int recordCount() throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num = 0;
		try {
			num = dao.recordCount(session);
		} finally {
			session.close();
		}
		return num;
	}
	
	public List<Dept> selectByHashMap(HashMap<String, Integer> map){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		//select deptno ~~~ between a and b
		//main에서 hashmap 생성 a, b 값 설정 service=> dao로 인자로 넘김
		//sql에서 key를 이용 a,b 값을 설정(parameterType=hashmap)
		
		List<Dept>list = null;
		try {
		list =dao.hashmap(session, map);
		session.commit();
		} finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectBydeptNoIn(HashMap<String, Integer> map) { //main의 map2를 받음
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept>list = null;
		try {
		list =dao.selectBydeptNoIn(session, map);
		session.commit();
		} finally {
			session.close();
		}
		return list;
		
	
		//main에서 3개의 key를 map에 설정 넘김
		//sql에서 select ~~ In 사용 결과를 리턴 메인에서 출력 deptn = 11, 12, 40 검색
	}
	
	public List<Dept> selectByName(String dname){
		SqlSession session2 = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
		list = dao.selectByName(session2, dname);
		}finally {
			session2.close();
		}
		return list;
	}
//===================================동적sql---==============
	//검색할 deptno를 맵에서 받음. where이 없으면 셀렉해서 객체, where이 붙으면 해당되는 사람 1명만 받아오는 작업
	public List<Dept> selectDynamicDeptno(HashMap<String, Integer> map){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, map);
		}finally {
			session.close();
		}
		return list;	
	}

	
	public List<Dept> selectDynamicDeptno2(Dept dept){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno2(session, dept);
		}finally {
			session.close();
		}
		return list;	
	}

}
