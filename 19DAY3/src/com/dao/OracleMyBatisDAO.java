package com.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보
	
	public OracleMyBatisDAO() {
	
	}

	public void delete(SqlSession session,int deptno) {
		int num= session.delete("delete", deptno);
		System.out.println("삭제된 갯수 :"+ num);
	}
	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept= session.selectOne("selectByDeptno", deptno);		
		return dept;
	}
	public List<Dept> selectAll(SqlSession session){
		//<select id="selectAll" resultType="com.dto.dept">
		List<Dept> list= session.selectList("selectAll");
		return list;
	}
		
	public void insert(SqlSession session, Dept dept) {
		int num= session.insert("deptInsert", dept);
		System.out.println("추가된 레코드 ===="+ num);
	}
	
	public void update(SqlSession session, Dept dept) {
		int num = session.update("update", dept);
		System.out.println("업데이트 갯수:"+num);
	}

	public int recordCount(SqlSession session) throws RecordNotFoundException {
		
		int num = session.selectOne("com.dept.DeptMapper.recordCount");
		System.out.println("전체 행의 갯수는:"+num);
		if(num==0) {
			throw new RecordNotFoundException("행의 갯수가 없습니다.");
		} return num;
	}
	
	public List<Dept> selectByDeptNameAndLoc(SqlSession session, Dept dept) {

		List<Dept> list = null;
		if(dept.getDname()!= null && dept.getLoc() != null) {
			list=session.selectList("selectByNameLoc",dept);
		}
		if(dept.getDname()!= null && dept.getLoc()==null) {
			list=session.selectList("selectByName", dept);
		}
		if(dept.getDname()== null && dept.getLoc()!=null) {
			list=session.selectList("selectByloc", dept);
		}		
		return list;
	}
	
	
	public List<Dept> selectByName(SqlSession session, String dname){
		List<Dept> list =null;
		list = session.selectList("com.dept.DeptMapper.selectByName", dname);
		return list;
	}
	
	
	
	public List<Dept> hashmap(SqlSession session, HashMap<String, Integer> map) {
	
		 List<Dept> list = session.selectList("com.dept.DeptMapper.selectByHashmap",map);
		return list;
	} 
	
	public List<Dept> selectBydeptNoIn(SqlSession session, HashMap<String, Integer> map) {
		
		 List<Dept> list = session.selectList("com.dept.DeptMapper.selectBydeptNoIn",map);
		return list;
	} 
	
}