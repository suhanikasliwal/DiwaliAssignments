package com.diwali.assignments;
import java.util.Scanner;
public class SumOfDigits {

	public static int sumOfDigits(int num) { int sum = 0;
		while(num!=0) {
			sum += (num%10);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Sum of digits of number "+n+": "+sumOfDigits(n));
        s.close();
	}

}
