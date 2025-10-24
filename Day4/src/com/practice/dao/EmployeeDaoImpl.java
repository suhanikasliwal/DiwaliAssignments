package com.practice.dao;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.practice.beans.Employee;
public class EmployeeDaoImpl implements EmployeeDao{
    ArrayList<Employee> emp;
    public EmployeeDaoImpl() {
    	emp = new ArrayList<Employee>();
    }
	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		emp.add(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(String empname) {
	    emp.remove(new Employee(empname));
		return false;
	}

	@Override
	public List<Employee> employeeList() {
		return emp;
	}

	@Override
	public List<Employee> sortEmployeeList() {
	    Collections.sort(emp);
		return emp;
	}

	@Override
	public List<Employee> findEmployeeByName(String name) {
		List<Employee> employee = new ArrayList<Employee>();
		for(Employee e: emp) {
			if(e.equals(new Employee(name))) {
				employee.add(e);
			}
		}
		return employee;
	}

	@Override
	public boolean addEmployeeListToFile() {
		try {
		FileOutputStream out = new FileOutputStream("EmployeeList.txt");
		for(int i=0;i<emp.size();i++) {
			String empData = emp.get(i).toString()+"\n";
			out.write(empData.getBytes());
		}
		out.close();
		}
		catch(IOException error) {
			System.out.println(error.getMessage());
			return false;
		}
		catch(Exception error) {
			System.out.println(error.getMessage());
			return false;
		}
		return true;
	}

}
