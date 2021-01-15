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
		Dept dept1 = session.selectOne("selectByDeptnoUse", deptno);
		return dept1;
	}
	public void insert (SqlSession session, Dept dept) {
		int num = session.insert("insert", dept);
		System.out.println("추가된 갯수:"+num);
	}
	
	public List<Object> hashmap (SqlSession session, int deptno) {
		List<Object> dept2 = session.selectList("hashmap", deptno);
		return  dept2;
	}
	
}
