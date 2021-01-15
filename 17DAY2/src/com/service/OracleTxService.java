package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	//4가지 변수 서비스로 이동
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	OracleTxDAO dao;

	public OracleTxService() {
		//드라이버 로딩
		//dao생성
		dao = new OracleTxDAO();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		//db연결
		//select호출 - conn을 인자로 넘김
		//connection 끊기(connection close)
		//각 함수마다 커넥션 연결, 트라이, 클로즈....
		Connection con = null;
		ArrayList<Dept> list = null;
		try { con = DriverManager.getConnection(url, userid, passwd);
		
			list = dao.select(con);  //con을 인자로 넘김!!!!! dao한테 리스트 ㅂ다아서 46에서 list리턴
		} finally {
			if (con != null)
				con.close();
		} 
		return list;
	}// end select

	public void insert(Dept xx) { //dept인수가 dept로바뀜 그래서 다 바꿔줘야함
		//db연결
		//insert호출 - conn을 인자로 넘김
		//connection 끊기(connection close)
		Connection con = null;
		try { 
			con = DriverManager.getConnection(url, userid, passwd);
			dao.insert(con, xx);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try{
				if (con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}// end insert
	public void update(Dept xx2)throws RecordNotFoundException { //dept받아옴
	
		Connection con = null;
		try { 
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con, xx2); //받아온 dept연결
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try{
				if (con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}//end deletes

	public void delete(int i) throws RecordNotFoundException {
		Connection con = null;
		try { 
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try{
				if (con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}
	
	public void insertDelete(Dept dept, int i) throws Exception {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
		//기본적으로 자동 커밋됨 con.setAutoCommit(false)/con.serAutoCommit(true) true가 default됨
			//현재 이 부분(106~112행)에서 true를 false를 바꿔야함 
			//insert와 delete를 하나의 tx로 묶음 tx의시작
			//in, del 동시에 하기위해 인자도 2개 받음
			//두 작업 중 하나가 안 끝나면(문제가 생기면) 롤백
			con.setAutoCommit(false);
			dao.insert(con, dept);
			dao.delete(con, i);
			//둘 중 문제가 생기면 트라이 캐치 캐치 캐치문에서 롤백(con.rollback);
			//작업이 끝나면 connetion에서 con.true해주면 됨
			//con.commit();
			//파이널 con.close(), 
			//메인에서 dept와 i 호출
			//없는번호일 경우, 삭제할 경우 int가 0 -> 익셉션아니고 정상수행, 테스트 하려면 딜리트쿼리를 틀리게할것
			con.commit();
			//현재 delete에서 강제 exception발생
			
		} catch (Exception e) {
			con.rollback(); //문제 발생 시 롤백
			System.out.println("rollback 발생");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (con != null)con.close();
//				con.setAutoCommit(true); 불필요함.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
	}







