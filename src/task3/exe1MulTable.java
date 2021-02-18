package task3;

import java.util.Scanner;

public class exe1MulTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want table");
		int a = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int table = a*i;
			System.out.println(table);
		}
	}
}
