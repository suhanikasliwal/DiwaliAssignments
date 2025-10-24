package com.practice.service;
import java.util.List;
import com.practice.beans.*;
public interface EmployeeService {

	void addEmployee(Employee employee);
	
	void removeEmployee(String empName);
	
	List<Employee> employeeList();
	
	List<Employee> sortEmployeeList();
	
	List<Employee> findEmployeeByName(String name);
	
	void addEmployeeListToFile();
	
}
