package task1;

import java.util.*;

public class addThreeNumbers {
	public static void main(String[] args) {
		int z=30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers between 1-10:");
		int a = sc.nextInt();
		int b = sc.nextInt();		
		int result = a+b+z;
		System.out.println("Result is:" + result);
	}	
}
