package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	void schemeEmp(String scheme);
	void addEmp(Employee emp);
	void delEmp(String id);
}