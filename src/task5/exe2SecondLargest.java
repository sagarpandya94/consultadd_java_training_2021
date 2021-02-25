package task5;

import java.util.Arrays;

public class exe2SecondLargest {
	public static void main(String[] args) {
		int arr[] = {1,3,2,5,4};
		int len = arr.length;
		Arrays.sort(arr);
		System.out.println("Second largest is:"+arr[len-2]);
	}
}
