package com.practice.test;
import java.util.Scanner;
import java.util.List;
import com.practice.beans.Employee;
import java.util.ArrayList;
import com.practice.service.EmployeeServiceImpl;
public class EmployeeManagementSystem {
	public static void displayEmployeeList(List<Employee> emp) {
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i).toString());
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	EmployeeServiceImpl eservice = new EmployeeServiceImpl();
	int ch = 0;
	do {
		System.out.println("1. Add a new employee\n2. Remove employee\n3. Display all employees\n4. Sort Employee Data\n5. Find employee by name\n6. Add employee list to file\n7. Exit");
		System.out.println("Enter your choice: ");
		ch = s.nextInt();
		if(ch==7) {
			System.out.println("Thank you");
			break;
		}
		switch(ch) {
		case 1->{
			System.out.println("Enter Employee Id: ");
			int empId = s.nextInt();
			System.out.println("Enter Employee Name: ");
			String empName = s.next();
			System.out.println("Enter Employee Designation: ");
			String empDesignation = s.next();
			Employee employee = new Employee(empId, empName, empDesignation);
			eservice.addEmployee(employee);
		}
		case 2->{
			System.out.println("Enter Employee Name: ");
			String empName = s.next();
			eservice.removeEmployee(empName);
		}
		case 3->{
	        List<Employee> emp = eservice.employeeList();
	        if(emp==null) {
	        	System.out.println("Employee List is empty");
	        }
	        else {
	        	displayEmployeeList(emp);
	        }
		}
		case 4->{
			 List<Employee> emp = eservice.sortEmployeeList();
		        if(emp==null) {
		        	System.out.println("Employee List is empty");
		        }
		        else {
		        	displayEmployeeList(emp);
		        }
		}
		case 5->{
		     System.out.println("Enter Employee Name: ");
		     String empN = s.next();
		     List<Employee> empNameList = eservice.findEmployeeByName(empN);
		     if(empNameList==null) {
		    	 System.out.println("Employee not found");
		     }
		     else {
		    	 displayEmployeeList(empNameList);
		     }
		}
		case 6->{
			eservice.addEmployeeListToFile();
		}
		default->{
			System.out.println("Enter a valid choice");
		}
		}
	}while(ch!=7);
}
}
