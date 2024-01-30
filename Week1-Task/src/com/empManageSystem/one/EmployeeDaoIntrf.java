package com.empManageSystem.one;

import java.util.concurrent.Flow.Publisher;

public interface EmployeeDaoIntrf {
//	create employee
	public void createEmployee(Employee emp);
//  show employee
	public void showAllEmployee();
//	show employee based on id
	public void showEmplyeeBassedOnID(int id);
//	update employee
	public void updateEmployee(int empid1, String name);
//	delete employee
	public void deleteemployee(int id);
	
	
	
	
	
	}
