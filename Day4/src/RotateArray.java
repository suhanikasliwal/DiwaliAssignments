import java.util.Scanner;

public class RotateArray {
public static void rotateRight(int arr[]) {
	int lastNum = arr[arr.length-1];
	for(int i=arr.length-1;i>0;i--) {
		arr[i] = arr[i-1];
	}
	arr[0]=lastNum;
}
public static void rotateArrayByKPositionRight(int k, int[] arr) {
	if(arr.length==1) {
		return;
	}
	while(k!=0) {
		rotateRight(arr);
		k--;
	}
}
public static void main(String[] args) {
	int arr[];
	Scanner s = new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int n = s.nextInt();
	arr = new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++) {
		System.out.println("Enter element: ");
		arr[i] = s.nextInt();
	}
	System.out.println("Enter number of position you want to rotate the array in right direction: ");
	int k = s.nextInt();
	rotateArrayByKPositionRight(k, arr);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
