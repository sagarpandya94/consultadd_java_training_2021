package task4;

import java.util.Arrays;
import java.util.Scanner;

public class exe4Isogram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word");
		String wd = sc.nextLine();
		System.out.println(isogram(wd));
	}

	public static boolean isogram(String str) {
		str = str.toLowerCase();

		char[] wdArray = str.toCharArray();
		Arrays.sort(wdArray);

		for(int i=0; i<wdArray.length-1;i++) {
			if(wdArray[i]==wdArray[i+1])
				return(false);
		}
		return(true);
	}
}
