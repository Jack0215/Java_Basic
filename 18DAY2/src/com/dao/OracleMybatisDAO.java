package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		// <select id="selectAll"

		List<Dept> list = session.selectList("selectByDeptno");
		System.out.println(list);
		return list;
	}
	
	public Dept selectByDeptno(SqlSession session) {
		Dept dept = session.selectOne("selectByDeptno");
		return dept;
	}
	
	public Dept selectByDeptnoUse(SqlSession session, int deptno) {
		Dept dept1 = session.selectOne("selectByDeptnoUse", deptno); //함수도 받는 인자가 같아야함
		return dept1;
	}
}
