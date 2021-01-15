package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// XXDAO 클래스 역할
// SqlSessionFactory 얻기(빌드하기)

public class MySqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory = null;
	static{
		String resource = "com/config/Configuration.xml"; //jdbc driver, url, id, pw 정보 
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource); 
			System.out.println("db연동성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream); //빌드
	}//end static	
	// SqlSessionFactory의 openSession() 메서드로 SqlSession 객체를 얻음
	public static SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}	
}//end class