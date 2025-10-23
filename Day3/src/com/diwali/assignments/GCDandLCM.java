package com.diwali.assignments;
import java.util.Scanner;
public class GCDandLCM {
	public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int gcd = findGCD(12, 4);
    	int lcm = findLCM(12, 4, gcd);
    	System.out.println("GCD: "+gcd+" LCM: "+lcm);
    }
}
