package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMybatisDAO {

	public List<Dept> selectAll(SqlSession session) {  
		//<select id="selectAll"
		List<Dept> list=  session.selectList("selectAll");
		//결과가 여러개인 select문 실행시 selectList 함수 사용
		// DeptMappper.xml의 id = "selectAll"인  sql문 실행 
		return list; //서비스로 리턴
	}

}
