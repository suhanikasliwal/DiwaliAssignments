package com.practice.dao;
import java.util.List;
import com.practice.beans.Employee;
public interface EmployeeDao {

	boolean addEmployee(Employee emp);
	
	boolean removeEmployee(String empName);
	
	List<Employee> employeeList();
	
	List<Employee> sortEmployeeList();
	
	List<Employee> findEmployeeByName(String name);
	
	boolean addEmployeeListToFile();
	
}
