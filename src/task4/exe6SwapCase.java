package task4;

import java.util.Scanner;

public class exe6SwapCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String swpStr = new String("");

		char[] strArray = str.toCharArray();
		for(char a:strArray) {
			if(Character.isLowerCase(a)) {
				swpStr+=Character.toUpperCase(a);
			}
			else
				swpStr+=Character.toLowerCase(a);
		}
		
		System.out.println("Swapped string:" + swpStr);
	}

}
