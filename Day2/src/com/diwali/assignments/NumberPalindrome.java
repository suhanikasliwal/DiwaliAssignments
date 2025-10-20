package com.diwali.assignments;
import java.util.Scanner;
public class NumberPalindrome {
public static boolean numberIsPalindrome(int n) {
	if(n%10==0) {
		return false;
	}
	StringBuilder s = new StringBuilder("");
	while(n!=0) {
		int ldigit = n%10;
		s.append(ldigit);
		n/=10;
	}
	int j=s.length()-1;
	for(int i=0;i<=s.length()/2;i++) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		j--;
	}
	return true;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	if(numberIsPalindrome(n)) {
		System.out.println(n+" is Palindromic Number");
	}
	else {
		System.out.println("Number is not Palindrome");
	}
	s.close();
}
}
