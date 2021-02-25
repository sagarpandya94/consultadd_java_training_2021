package task5;

import java.util.Arrays;

public class exe11SortArray {
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,8,10};
		int len = arr.length;
		
		Arrays.sort(arr);
		int[] temp = new int[len];
		
		int max=len-1, min=0;
		for(int i=0; i< len; i++) {
			if(i%2==0) {
				temp[i]=arr[max];
				max--;
			}
			else {
				temp[i]=arr[min];
				min++;
			}
		}
		
		for(int x: temp){
			System.out.println(x);
		}
		
	}
}
