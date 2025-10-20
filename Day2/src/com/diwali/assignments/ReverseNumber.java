package com.diwali.assignments;
import java.util.Scanner;
public class ReverseNumber {
	public static int reverseNumber(int n) { int revNum = 0;
	if(n<10 && n>=0) {
		return n;
	}
		while(n!=0) {
			revNum += (n%10);
			revNum*=10;
			n/=10;
		}
		return revNum/10;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	int revNum = reverseNumber(n);
	System.out.println("Reverse Number: "+revNum);
}
}
