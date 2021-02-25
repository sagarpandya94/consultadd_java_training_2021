package task5;

import java.util.Arrays;
import java.util.Scanner;

public class exe9SumOfElements {
	public static void main(String[] args) {
		int arr[] = {1,3,4,7,2,5,6};
		int len = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target value");
		int target = sc.nextInt();
		
		Arrays.sort(arr);
		int start=0,end=len-1;
		
		while(start<end) {
			if(arr[start]+arr[end] == target) {
				System.out.println("Elements are:"+ arr[start] + arr[end]);
				start++; end--;
				continue;
			}
			else if(arr[start]+arr[end] < target)
				start++;
			else if(arr[start]+arr[end] > target)
				end--;
			else
				break;
				
		}	
	}
}
