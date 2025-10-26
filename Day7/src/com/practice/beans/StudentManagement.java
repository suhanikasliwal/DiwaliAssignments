package com.practice.beans;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.util.*;

public class StudentManagement {
    
	public static void storeStudent(Student student, String filename) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("StudentList.txt", true))){
			out.writeObject(student);
		}
		catch(IOException err) {
			System.out.println(err.getMessage());
		}
	}
	
	public static List<Student> readStudentsFromFile(String filename){
		List<Student> students = new ArrayList<Student>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			students.add((Student) ois.readObject());
		}
		catch(ClassNotFoundException error) {
			System.out.println(error.getMessage());
		}
		catch(EOFException err) {
			System.out.println(err.getMessage());
		}
		catch(IOException error) {
			System.out.println(error.getMessage());
		}
		return students;
	}
	public static void sortStudentsByAttendance(List<Student> students) {
		students.sort((s1, s2)->Integer.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));
	}
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		String filename = "Students.dat";
		Object studentData[][] = {
				{1, "Suhani", "E&TC", 75, 65},
				{2, "Suhani", "E&TC", 75, 65},
				{3, "Suhani", "E&TC", 75, 65},
				{4, "Suhani", "E&TC", 75, 65},
				{5, "Suhani", "E&TC", 75, 65},
				{6, "Suhani", "E&TC", 75, 65},
				{7, "Suhani", "E&TC", 75, 65},
				{8, "Suhani", "E&TC", 75, 65},
				{9, "Suhani", "E&TC", 75, 65},
				{10, "Suhani", "E&TC", 75, 65}
		};
for(Object[] data: studentData) {
		Student student = new Student((int) data[0], (String) data[1], (String) data[2], (int) data[3], (int) data[4]);
		students.add(student);
		storeStudent(student, filename);
}
List<Student> allStudents = readStudentsFromFile("StudentList.txt");
sortStudentsByAttendance(allStudents);
for(Student student: allStudents) {
	System.out.println(student);
}
	}

}
