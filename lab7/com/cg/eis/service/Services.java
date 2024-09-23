package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class Services implements EmployeeService {
	
	HashMap<String, Employee> empMap = new HashMap<String, Employee>();
	
	public void addEmp(Employee emp) {
		
		empMap.put(emp.getId(), emp);
	}
	
	public void delEmp(String id) {
		
		if(empMap.containsKey(id)) {
			empMap.remove(id);
			System.out.println("Employee "+id+" removed");
			
		}
		else {
			System.out.println("No such employee");
		}
	}
	
	public void schemeEmp(String scheme) {
		
		System.out.println("List of employees with insurance scheme: "+ scheme);
		
		for(Employee emp : empMap.values()) {
			
			if(emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
				System.out.println(emp);
			}
		}
		
	}

}
