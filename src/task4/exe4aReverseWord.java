package task4;

import java.util.*;

public class exe4aReverseWord {
	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String senArray[] = sen.split(" ");
		String reverseSen = "";
		for(String s: senArray) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			reverseSen+=sb.toString() + " ";
		}
		
		System.out.println("Reverse Sentence:" + reverseSen);
	}
}
