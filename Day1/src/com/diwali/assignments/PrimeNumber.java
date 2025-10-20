package com.diwali.assignments;
import java.util.Scanner;
public class PrimeNumber {

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
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num = s.nextInt();
	    if(isPrime(num)) {
	    	System.out.println(num+" is prime number");
	    }
	    else {
	    	System.out.println(num+" is composite number");
	    }
	    
	}

}
