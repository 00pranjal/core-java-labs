package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

public class InsuranceManagementSystem {
	
	public static void main(String[] args) {
		
		Services empServices = new Services();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose:");
			System.out.println("1. Display employees by scheme");
			System.out.println("2. Add employee");
			System.out.println("3. Remove employee");
			System.out.println("4. Exit");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch (n) {
			case 1: {
				
				System.out.println("Enter insurance scheme");
				String scheme = sc.nextLine();
				empServices.schemeEmp(scheme);
				break;
			}
			case 2:{
				System.out.println("Enter Employee details: ");
				System.out.println("Enter employee id");
				String id = sc.nextLine();
				System.out.println("Enter employee name");
				String name = sc.nextLine();
				System.out.println("Enter employee salary");
				int salary = sc.nextInt();
				sc.nextLine();
				
				Employee emp = new Employee(id, name, salary);
				empServices.addEmp(emp);
				System.out.println("Employee added");
				break;
			}
			case 3:{
				System.out.println("Enter id of employee you want to remove");
				String id = sc.nextLine();
				empServices.delEmp(id);
				break;
			}
			case 4:{
				System.out.println("Exiting");
				sc.close();
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}
	}

}
