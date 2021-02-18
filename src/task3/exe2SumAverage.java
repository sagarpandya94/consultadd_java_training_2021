package task3;

import java.util.Scanner;

public class exe2SumAverage {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter array element");
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		int avg= sum/10;
		System.out.println("Sum is" + sum + "average is" + avg);
	}
}
