package com.diwali.assignments;
import java.util.Scanner;
public class FibonacciSeries {
public static int[] FibonacciNumbers(int n) {
	if(n<=0) {
		return null;
	}
	int[] arr = new int[n];
	arr[0] = 0;
	int i=0;
	int j=1;
	if(n==1) {
     return arr;		
	}
	arr[1] = 1;
	if(n==2) {
		return arr;
	}
	n-=2;
	while(n!=0) {
		arr[j+1] = arr[i]+arr[j];
		i = j;
		j = j+1;
		n--;
	}
	return arr;
}
public static void display(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = s.nextInt();
	int arr[] = FibonacciNumbers(num);
	display(arr);
}
}