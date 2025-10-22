package com.diwali.assignments;
import java.util.Scanner;
public class PrintPattern {
public static void printPattern1(int num) {
	for(int i=1;i<=num;i++) {
		for(int y=1;y<=i;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void printPattern2(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=(num-i)+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void printPattern3(int num) {
	for(int i=1;i<=num;i++) {
       for(int j=1;j<=num-i;j++) {
    	   System.out.print(" ");
       }
       for(int y=1;y<=i;y++) {
    	   System.out.println("*");
       }
       System.out.println();
}
}
public static void printPattern4(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int y=1;y<=(num-i)+1;y++) {
			System.out.println("*");
		}
	}
}
public static void printPattern5(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num-i;j++) {
		System.out.print(" ");	
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int y=1;y<i;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void printPattern6(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<i;j++) {
			System.out.println(" ");
		}
		for(int y=1;y<=(num-i)+1;y++) {
			System.out.print("*");
		}
		for(int y=1;y<=num-i;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void printPattern7(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num-i;j++) {
			System.out.print(" ");
		}
		for(int y=1;y<=i;y++) {
			System.out.print("*");
		}
		for(int y=1;y<i;y++) {
			System.out.println("*");
		}
		System.out.println();
	}
	for(int i=1;i<=num;i++) {
		for(int y=1;y<i;y++) {
			System.out.print(" ");
		}
		for(int y=1;y<=(num-i)+1;y++) {
			System.out.print("*");
		}
		for(int j=1;j<num-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
