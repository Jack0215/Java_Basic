	package com.employee.biz;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;

public interface IEmployeeBiz {

	
	public  List<Employee> selectAllEmployee();
	
	public List<Employee> searchList(String inputSubMenu, String searchWord)throws DataNotFoundException;
	
//	public int createEmployeeNum();
//	
//	public void employeeInsert(Employee emp);
//
//	public void employeeDelete(int employeeNum)throws DataNotFoundException;
//	
//	public void employeeService(int empno, String inputColumn)throws DataNotFoundException;

	

}
