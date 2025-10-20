package com.diwali.assignments;
import java.util.*;
public class Factorial {
public static int factorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact*=i;
	}
	return fact;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	System.out.println("Factorial: "+factorial(n));
	s.close();
}
}
