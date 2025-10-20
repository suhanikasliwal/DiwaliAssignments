package com.diwali.assignments;
import java.util.Scanner;
public class EvenOrOdd {
public static boolean isEvenOrOdd(int n) {
	return n%2==0;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	if(isEvenOrOdd(n)) {
		System.out.println(n+" is even number");
	}
	else {
		System.out.println(n+" is odd number");
	}
}
}
