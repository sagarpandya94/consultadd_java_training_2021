package task2;

import java.util.Scanner;

public class exe7FloatNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		if(a==0)
			System.out.println("Number is 0");
		else if(a<0)
			System.out.println("Negative");
		else if(a>0)
			System.out.println("Positive");
		
		if(Math.abs(a)<1)
			System.out.println("small");
		else if(Math.abs(a)>100000)
			System.out.println("Larger");
	}
}
