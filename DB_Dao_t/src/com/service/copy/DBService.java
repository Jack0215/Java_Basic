package com.service.copy;
import com.dao.copy.DBDAO;
public class DBService {
	
//	OracleDAO dao = null;
//	public void setDAO(OracleDAO dao) {  //
//		this.dao = dao;
//		dao.connectOracle();
	
	DBDAO dao = null; 	    
						  //2. 변수이름             자기가 자신의 객체 생성
	private static DBService service = new DBService ();
	public static DBService getService() {   /*얘는 위의 서비스를 가져오면됨 그래서 타입을 DBService으로 해줌*/
		return service;
	}
	//3. 생성한 객체를 가져갈 수 있는 static 함수 만들기/ DBSer은 19에서 막혀있어서 static붙여줌
	
	//1. 생성자를 private로 막는다. 기본생성자가 있는 상황
		private DBService() {}
	
	//↓MySQL이든, Oracle이든 다 받음
	public void setDAO(DBDAO dao) {  //갈색 dao는 new oracle
	/*멤버변수*/	this.dao = dao;
		dao.connect();  //이 때 실행되는건 넘어온 객체(new oracle)의 connect가 실행됨
		} 
	public void insert (DBDAO dao) {
		dao.insert();
	}
}

//인터페이스 생성, 오버라이딩