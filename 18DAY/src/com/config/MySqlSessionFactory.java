package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {   //4가지 정보가 안보이지만, 4가지 정보는 15라인에 configuration.xml파일을 따로 만들어놨음 여기다 4가지 정보를 담아놓을거임. 
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		
		String resource = "Configuration.xml";  //파일이름,경로 수정이 이 부분만 변경해주면 됨. //Configuration.xml 안에는 2가지가 있음1. 연동에 필요한 4가지 정보 2. sql문을 담고있는 wrapper가 누구인가
		InputStream inputStream=null;
		try {	
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);  //최종적으로 db에 연동되면 커넥션 만들어지듯, SqlSessionFactory(커넥션을 얻어갈 수 있는 클래스)이 만들어짐
	}//end static
	
	//SqlSession 반환해주는 메서드
	// MySqlSessionFactory.getSession() <- 실제 사용할 애들은 겟 세션을 통해서 db접속하고 사용하게 될 것임
	public static SqlSession getSession() {  //다른데서 getSession 호출하면됨. 호출(클래스이름.함수이름 = MySqlSessionFactory.getSession)
		SqlSession session = sqlSessionFactory.openSession(); //실제 사용자가 사용할 connection과 비슷한 객체
		return session;
	}
	
}//end class





