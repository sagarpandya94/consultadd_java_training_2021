package task4;

import java.util.Scanner;

public class exe3NoSpace {
	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		
		System.out.println(sen.replaceAll(" ", ""));
	}
}
