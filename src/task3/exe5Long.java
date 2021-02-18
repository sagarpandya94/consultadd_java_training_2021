package task3;

import java.util.Scanner;

public class exe5Long {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int sum=0, count=0;
		while(a!=0) {
			sum+=(int)(a%10);
			a=a/10;
			count++;
		}
		System.out.println("Sum is" + sum + "and count is" + count);		
	}
}
