package task3;

import java.util.Scanner;

public class exe8LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Leap year");
				}
				else {
					System.out.println("Not leap year");
				}
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("Not leap year");
		}
	}

}
