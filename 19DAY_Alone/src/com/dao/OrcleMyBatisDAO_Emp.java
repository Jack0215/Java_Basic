package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Emp;

public class OrcleMyBatisDAO_Emp {

	public OrcleMyBatisDAO_Emp() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public List<Emp> select (SqlSession session){
		List<Emp> list = session.selectList("selectemp");
		return list;
	}
	
	public Emp selectdeptno (SqlSession session, int empno) {
		Emp emp = session.selectOne("selectempno", empno);
		return emp;
	}
}
