package com.diwali.assignments;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = s.nextInt();
int n = num;
int cubSum = 0;
while(n!=0) {
	int ldigit = n%10;
	cubSum+=(ldigit*ldigit*ldigit);
	n/=10;
}
if(cubSum==num) {
	System.out.println(num+" is Armstrong Number");
}
else {
	System.out.println("Not an Armstrong Number");
}
s.close();
}
}
