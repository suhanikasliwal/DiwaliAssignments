package com.diwali.assignments;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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
		System.out.println();
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
public static void printPattern8(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int y=1;y<=((num*2)-(i*2));y++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=num;i++) {
		for(int y=1;y<=((num*2)-(i*2))+2;y++) {
			System.out.print("*");
		}
		for(int j=1;j<=(i*2)-2;j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
}
public static void printPattern9(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
public static void printPattern10(int num) {
for(int i=1;i<=num;i++) {	
	for(int y=1;y<=num-i;y++) {
		System.out.print(" ");
	}
	for(int y=1;y<=i;y++) {
		System.out.print(y);
	}
	for(int y=num-i;y>0;y--) {
		System.out.print(y);
	}
	System.out.println();
}
for(int i=1;i<=num;i++) {
	for(int y=1;y<i;y++) {
		System.out.print(" ");
	}
	for(int y=1;y<=(num-i)+1;y++) {
		System.out.print(y);
	}
	for(int y=num-i;y>0;y--) {
		System.out.print(y);
	}
	System.out.println();
}
}
public static void printPattern11(int num) {
	for(int i=1;i<=num;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=(num-i)+1;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i=1;i<=num;i++) {
		for(int y=1;y<=num-i;y++) {
			System.out.print(" ");
		}
		for(int y=1;y<i;y++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
public static void printPattern12(int num) {
	       
	        
	    }
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	printPattern1(n);
	printPattern2(n);
	printPattern3(n);
	printPattern4(n);
	printPattern5(n);
	printPattern6(n);
	printPattern7(n);
	printPattern7(n);
	printPattern8(n);
	printPattern9(n);
	printPattern10(n);
	printPattern11(n);
	printPattern12(n);
	s.close();
}
}
