package task5;

import java.util.Arrays;

public class exe7DiffLargestSmallest {
	public static void main(String[] args) {
		int a[] = {9,8,7,4,3,2};
		Arrays.sort(a);
		
		int diff = a[a.length-1] - a[0];
		System.out.println("Difference is: " + diff);
	}
}
