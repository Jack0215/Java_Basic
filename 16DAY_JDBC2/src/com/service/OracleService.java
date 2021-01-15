package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleService {

//	OracleDAO dao; //멤머볍ㄴ수로 오라클디에오의 dao를 갖고있음 null값이 기본

	
	OracleDAO dao = new OracleDAO(); //이렇게 하면 15~17없어져도 됨
//	public OracleService() {   //기본생성자
//		//dao생성
//		dao = new OracleDAO();
//	}
	public void insert(Dept dept) {//메인에서 호출->dao.insert 
		dao.insert(dept);
		System.out.println("dao insert load");
	} 
	
	public void update(Dept dept) throws RecordNotFoundException {
		dao.update(dept);
		
	}
	 
	public void delete(int deptno) throws RecordNotFoundException {
		dao.delete(deptno);
	}
	public ArrayList<Dept> select()throws SQLException {
	//Dao의 select함수 호출  실제 데이터 받아오기 	
		
	
		ArrayList<Dept> list = dao.select();
		
		return list;
	}
	
	public void selectbydeptnoDepts(int i) throws RecordNotFoundException, SQLException{
		ArrayList<Dept> list = dao.selectbydeptno(i);
		
	} 

	public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws SQLException{
		ArrayList<Dept> list = dao.selectByNameLoc(map);
		return list;
	}
	
	}


