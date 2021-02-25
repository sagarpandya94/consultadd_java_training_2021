package task5;

public class exe8DuplicateElements {
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,3,3,4};
		int temp[] = new int[arr.length];

		int len = arr.length;
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
		
		System.out.println("length is:" + j);
	}
}
