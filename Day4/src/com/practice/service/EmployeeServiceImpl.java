package com.practice.service;
import java.util.List;
import com.practice.beans.*;
import com.practice.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl implements EmployeeService{
EmployeeDaoImpl edao;
public EmployeeServiceImpl() {
	edao = new EmployeeDaoImpl();
}
@Override
public void addEmployee(Employee employee) {
	if(edao.addEmployee(employee)) {
		System.out.println("New Employee added");
	}
	else {
		System.out.println("Error occured while adding new employee");
	}
}
@Override
public void removeEmployee(String empName) {
	if(edao.removeEmployee(empName)) {
		System.out.println("Employee removed successfully");
	}
	else {
		System.out.println("Cannot find employee");
	}
}
@Override
public List<Employee> employeeList() {
	return edao.employeeList();
}
@Override
public List<Employee> sortEmployeeList() {
	return edao.sortEmployeeList();
}
@Override
public List<Employee> findEmployeeByName(String name) {
	return edao.findEmployeeByName(name);
}
@Override
public void addEmployeeListToFile() {
	if(edao.addEmployeeListToFile()) {
		System.out.println("Employee List added to file");
	}
	else {
		System.out.println("Data not added to file");
	}
}

}
