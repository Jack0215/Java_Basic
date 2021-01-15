package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

//	OracleDAO dao; //멤머볍ㄴ수로 오라클디에오의 dao를 갖고있음 null값이 기본

	
	OracleDAO dao = new OracleDAO(); //이렇게 하면 15~17없어져도 됨
//	public OracleService() {   //기본생성자
//		//dao생성
//		dao = new OracleDAO();
//	}
		
	public ArrayList<Dept> select()throws SQLException {
	//Dao의 select함수 호출  실제 데이터 받아오기 	
		
		
		ArrayList<Dept> list = dao.select();
		
		return list;
	}
	
}
