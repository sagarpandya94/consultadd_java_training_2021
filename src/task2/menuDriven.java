package task2;

import java.util.*;

public class menuDriven {
	public static void main(String[] args) {
		int first, second, first1 = 0, second2=0, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter 3 for Division");
		System.out.println("Enter 4 for Multiplication");
		System.out.println("Enter 5 for Average");
		
		int choice = sc.nextInt();
		if(choice!=5) {
			System.out.println("Enter 2 numbers:");
			first = sc.nextInt();
			second = sc.nextInt();
		}
		else {
			System.out.println("Enter 4 numbers:");
			first = sc.nextInt();
			second = sc.nextInt();
			first1 = sc.nextInt();
			second2 = sc.nextInt();
		}
		
		switch(choice) {
		case 1: 
			result = first + second;
			break;
		case 2:
			result = first - second;
			break;
		case 3:
			result = first / second;
			break;
		case 4: 
			result = first * second;
			break;
		case 5:
			result = (first + second + first1 + second2)/4;
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		
		if(result<0)
			System.out.println("Oops option" + choice + "is returning negative number");
		else
			System.out.println("Result is" + result);		
	}
	
}
