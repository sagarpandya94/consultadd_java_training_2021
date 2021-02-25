package task5;

import java.util.Arrays;

public class exe1RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {2,3,1,4,5,2};
		Arrays.sort(arr);
		exe1RemoveDuplicate rd = new exe1RemoveDuplicate();
		rd.removeDuplicate(arr);
		
	}
	
	public void removeDuplicate(int arr[]) {
		int len = arr.length;
		
		int[] temp = new int[len];
		int j=0;
		for(int i=0;i<len-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];			
			}
		}
		temp[j++] = arr[len-1];
		
		for(int i=0; i<j; i++) {
			System.out.println(temp[i]+"");
		}
	}
}
