package task2;

import java.util.Scanner;

public class exe8CharInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		a = Character.toLowerCase(a);
		
		if(a=='r' || a=='a' || a=='n' || a=='d' || a=='o' || a=='m')
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}