package task3;

import java.util.Scanner;

public class exe11FloatNumber {
	public static void main(String[] args) {
		System.out.println("Enter 2 float number");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		if(Math.abs(a-b)<=0.01)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}	
}
