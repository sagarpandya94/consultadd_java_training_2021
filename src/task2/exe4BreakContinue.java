package task2;

import java.util.*;

public class exe4BreakContinue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		while(true) {
			System.out.println("Enter a number");
			a=sc.nextInt();
			if(a<0)
				{System.out.println("It's over"); break;}
			else
				{System.out.println("Good going"); continue;}
		}
	}
}
