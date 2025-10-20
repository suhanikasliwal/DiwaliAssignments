package com.diwali.assignments;
import java.util.*;
public class LongestStringInArray {
public static int longestStringInArray(String[] strs) { int length = 0;
	for(int i=0;i<strs.length;i++) {
		if(strs[i].length()>length) {
			length=strs[i].length();
		}
	}
	return length;
}
public static void main(String[] args) {
	String[] strs = {"Suhani","Pune","Kasliwal", "Prathamesh"};
	int maxLength = longestStringInArray(strs);
	System.out.println("Longest length: "+maxLength);
}
}
