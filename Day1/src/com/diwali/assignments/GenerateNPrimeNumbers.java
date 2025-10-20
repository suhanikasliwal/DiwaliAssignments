package com.diwali.assignments;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class GenerateNPrimeNumbers {
public static boolean isPrime(int number) {
	if(number==2) {
		return true;
	}
	for(int i=2;i<=number/2;i++) {
		if(number%i==0) {
			return false;
		}
	}
	return true;
}
public static List<Integer> nPrimeNumbers(int n){
	ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int y=2;y<=Integer.MAX_VALUE;y++) {
			if(isPrime(y) && n!=0) {
				arr.add(y);
				n--;
			}
			if(n==0) {
				return arr;
			}
		}
		return arr;
}
public static void display(List<Integer> primeNumbers) {
	for(int i=0;i<primeNumbers.size();i++) {
		System.out.println(primeNumbers.get(i));
	}
}
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = s.nextInt();
	List<Integer> primeNumbers = nPrimeNumbers(num);
	display(primeNumbers);
	s.close();
}
}
