package task2;

import java.util.Scanner;

public class exe6OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==1)
			System.out.println("NEW");
		else {
			if(a>=2 && a<=5)
				System.out.println("OLD");
			else if(a>=6 && a<=30)
				System.out.println("NEW");
			else if(a>30)
				System.out.println("OLD");
		}
	}
}
