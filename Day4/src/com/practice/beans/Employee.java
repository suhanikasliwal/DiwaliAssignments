package com.practice.beans;
import java.util.Collections;
public class Employee implements Comparable<Employee>{
private int empId;
private String empname;
private String empRole;
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + ", empRole=" + empRole + "]";
}
public Employee(int empId) {
	super();
	this.empId = empId;
}
public Employee(int empId, String empname) {
	super();
	this.empId = empId;
	this.empname = empname;
	empRole = "SDE";
}
public Employee(String empname) {
	this.empname = empname;
}
public Employee(int empId, String empname, String empRole) {
	super();
	this.empId = empId;
	this.empname = empname;
	this.empRole = empRole;
}
@Override
public boolean equals(Object obj) {
	return ((this.empname).equals(((Employee)obj).empname));
}
public int compareTo(Employee obj) {
	return ((this.empId)-obj.empId);
}
}
