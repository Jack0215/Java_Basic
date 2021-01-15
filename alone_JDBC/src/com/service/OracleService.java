package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

	OracleDAO dao = new OracleDAO();
		
	public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws SQLException{
		 ArrayList<Dept> list = dao.selectByNameLoc(map);
		 return list;
	}
}
