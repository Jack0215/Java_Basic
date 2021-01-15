package com.service;

import com.dao.OracleDAO;

public class DBService {

	OracleDAO dao = null;
	public void setDAO(OracleDAO dao) {  //
		this.dao = dao;
		dao.connectOracle(); //실제 실행할 dao 클래스의 db접속 함수 호출
	}
}
