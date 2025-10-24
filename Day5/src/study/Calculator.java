package study;
import java.util.Scanner;
class WrongNumberException extends Exception{
	public WrongNumberException(String error) {
		super(error);
	}
}
public class Calculator {
public static int add(int a, int b) {
	return a+b;
}
public static int sub(int a, int b) {
	return a-b;
}
public static int div(int a, int b) {
	return a/b;
}
public static int mul(int a, int b) {
	return a*b;
}
public static int mod(int a, int b) {
	return a%b;
}
public static int calculate(int a, int b, String operator) {
	try {
	if(operator.equals("+")) {
		return add(a, b);
	}
	else if(operator.equals("-")) {
		return sub(a, b);
	}
	else if(operator.equals("/")) {
		return div(a, b);
	}
	else if(operator.equals("*")) {
		return mul(a, b);
	}
	else if(operator.equals("%")) {
		return mod(a, b);
	}
	else {
	   	throw new WrongNumberException("Operation cannot be performed");
	}
	}
	catch(WrongNumberException error) {
		System.out.println(error.getMessage());
	}
	return -1;
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = s.nextInt();
	System.out.println("Enter second number: ");
	int b = s.nextInt();
	System.out.println("Enter operator of operation you want to perform: ");
	String operation = s.next();
	int calculation = calculate(a, b, operation);

	System.out.println(calculation);
}
}
