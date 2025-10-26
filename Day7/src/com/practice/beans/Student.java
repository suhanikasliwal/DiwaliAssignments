package com.practice.beans;

public class Student {
private int rollNo;
private String sName;
private String course;
private int attendancePercentage;
private int score;
public int getAttendancePercentage() {
	return attendancePercentage;
}
public void setAttendancePercentage(int attendancePercentage) {
	try{
		if(attendancePercentage<60) {
		throw new AttendanceManagement("Attendance is too less");
		}
		this.attendancePercentage = attendancePercentage;
	}
	catch(AttendanceManagement err) {
		System.out.println(err.getMessage());
	}
	catch(Exception err) {
		System.out.println(err.getMessage());
	}
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Student(int rollNo) {
	super();
	this.rollNo = rollNo;
}
public Student(int rollNo, String sName, String course, int attendancePercentage, int score) {
	super();
	this.rollNo = rollNo;
	this.sName = sName;
	this.course = course;
	this.attendancePercentage = attendancePercentage;
	this.score = score;
}
public String calculateGrade() {
	if(score>=0 && score<40) {
		return "Fail";
	}
	if(score>=40 && score<50) {
		return "Pass";
	}
	if(score>=50 && score<60) {
		return "Second Class";
	}
	if(score>=60 && score<75) {
		return "First Class";
	}
	if(score>=75 && score<=100) {
		return "Distinction";
	}
	return "Invalid Score";
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", sName=" + sName + ", course=" + course + ", attendancePercentage="
			+ attendancePercentage + ", score=" + score + "]";
}
}
