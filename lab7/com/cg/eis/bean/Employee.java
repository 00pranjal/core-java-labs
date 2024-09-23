package com.cg.eis.bean;

public class Employee {
	
	private String id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	
	
	public String findDesignation(int salary) {
		
		if(salary >= 40000) {
			return "Manager";
		}
		else if (salary >= 20000) {
			return "Programmer";
		}
		else if(salary >= 5000) {
			return "System Associate";
		}
		else {
			return "Clerk";
		}
	}
	
	public String findScheme(String designation) {
		
		if(designation == "Manager") {
			insuranceScheme = "Scheme A";
		}
		else if (designation == "Programmer") {
			insuranceScheme = "Scheme B";
		}
		else if (designation =="System Associate") {
			insuranceScheme = "Scheme C";
		}
		else if(designation == "Clerk") {
			insuranceScheme = "No Scheme";
		}
		return insuranceScheme;
	}
	
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = findDesignation(salary);
		this.insuranceScheme = findScheme(designation);
	};
	
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	public String getDesignation() {
		return designation;
	}


	public String getInsuranceScheme() {
		return insuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	

}
