package com.diwali.assignments;
import java.util.*;
public class MultiplicationTable {
public static void product(int num) {
	for(int i=1;i<=12;i++) {
		System.out.println(num+" x "+i+" = "+ num*i);
	}
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = s.nextInt();
	product(num);
	s.close();
}
}
