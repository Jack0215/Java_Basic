package workshop08.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryBiz {

	private String driver;
	private String url;
	private String user;
	private String pass;
	
	
	public FactoryBiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FactoryBiz(String driver, String url, String user, String pass) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}

	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

	@Override
	public String toString() {
		return "FactoryBiz [driver=" + driver + ", url=" + url + ", user=" + user + ", pass=" + pass + "]";
	}

	public ArrayList<FactoryDTO> getFactoryAll(){
		
        
  
        	return null;
        	
        
	}//end getFactoryAll
}
