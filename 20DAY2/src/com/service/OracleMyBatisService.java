package com.service;

import java.util.HashMap;
import java.util.List;


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
	
	public List<Dept> selectDynamicDeptno(Dept dept){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, dept);
		}finally {
			session.close();
		}
		return list;	
	}
	
	public List<Dept> selectDynamicChoose(HashMap<String, String> map){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicChoose(session, map);
		}finally {
			session.close();
		}
		return list;	
	}
	

}
