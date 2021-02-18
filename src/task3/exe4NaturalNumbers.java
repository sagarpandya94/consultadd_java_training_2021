package task3;

import java.util.Scanner;

public class exe4NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int sum=0;
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum is" + sum);
	}
}
