package Test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

public class Test03_Service {
	
	test03_DAO dao;
	
	public Test03_Service() {
		dao = new test03_DAO();
		
		// TODO Auto-generated constructor stub
	}

	public void insert (DEPT dept) {
		

		dao.insert( dept);
		}
}
	

