package com.diwali.assignments;
import java.util.Scanner;
public class SumNEvenNumber {
public static int sumOfNEvenNumber(int n) {
	int sum=0;
	for(int i=2;i<Integer.MAX_VALUE;i+=2) {
		sum+=i;
		n--;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	System.out.println("Sum :"+sumOfNEvenNumber(n));
	s.close();
}
}
