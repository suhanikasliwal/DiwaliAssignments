package com.diwali.assignments;
import java.util.*;
public class AdditionOfTwoNumbers {
public static int add(int a, int b) {
	return a+b;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num1 = s.nextInt();
	System.out.println("Enter another number: ");
	int num2 = s.nextInt();
	System.out.println("Addition: "+add(num1, num2));
}
}
