	package com.employee.biz;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;

public interface IEmployeeBiz {

	
	public  List<Employee> selectAllEmployee();
	
	public List<Employee> searchList(String inputSubMenu, String searchWord)throws DataNotFoundException;
	
	public int createEmployeeNum();
	
	public void employeeInsert(Employee emp);	

}
