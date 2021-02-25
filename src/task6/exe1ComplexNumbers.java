package task6;

import java.util.Scanner;

public class exe1ComplexNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real part:");
		int real = sc.nextInt();
		System.out.println("Enter imaginary part:");
		int imag = sc.nextInt();
		
		Complex c = new Complex();
		
		System.out.println("Multiplication:"+ c.mul(real,imag));
		System.out.println("Addition:"+ c.sum(real,imag));
		System.out.println("Difference:" + c.diff(real, imag));	
	}	
}

class Complex{
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int diff(int a, int b) {
		return a-b;
	}
}


