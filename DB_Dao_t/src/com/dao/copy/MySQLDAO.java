package com.dao.copy;

public class MySQLDAO implements DBDAO{
	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MySQLDAO.connect1");
	}

	public void connectMySQL() {
		System.out.println("MySQLDAO.connect2");
		//mysql db 접속하여 사용하는 함수-메소드
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("222");
	}
}
