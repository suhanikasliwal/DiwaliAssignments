package com.diwali.assignments;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class MissingNumber {
public static int missingNumber(int[] arr) {
	Set<Integer> arr1 = new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		arr1.add(arr[i]);
	}
	for(int i=0;i<arr.length;i++) {
		if(!arr1.contains(i)) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of elements you want to add in array: ");
	int size = s.nextInt();
	int[] arr = new int[++size];
	for(int i=0;i<size;i++) {
		System.out.print("Enter Number: ");
		arr[i] = s.nextInt();
	}
	int missingNumberPresent = missingNumber(arr);
	if(missingNumberPresent==-1) {
		System.out.println("Every Number is Present");
	}
	else {
		System.out.println("Missing Number: "+missingNumberPresent);
	}
		
	}
}
