package task5;

import java.util.Arrays;

public class exe10MinSum {
	public static void main(String[] args) {
		int[] arr = {-2,-5,-3,1,0,7};
		int len = arr.length;
		int min1=0, min2=1, sum, minimum;
		Arrays.sort(arr);
		
		minimum=Math.abs(arr[min1]+arr[min2]);
		
		for(int i=0;i<len;i++) {
			for(int j=i+1; j<len; j++) {
				sum=Math.abs(arr[i]+arr[j]);
				if(sum<minimum) {
					min1=i;
					min2=j;
					minimum=sum;
				}
			}
		}
		
		System.out.println("two elements are:" + arr[min1] + arr[min2]);
	}
}
