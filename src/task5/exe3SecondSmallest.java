package task5;

import java.util.*;

public class exe3SecondSmallest {
	public static void main(String[] args) {
		int arr[] = {5,3,2,1,4};
		int len = arr.length;
		Arrays.sort(arr);
		System.out.println("Second smallest element is: "+arr[1]);	
	}

}
