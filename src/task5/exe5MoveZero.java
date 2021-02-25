package task5;

public class exe5MoveZero {
	public static void main(String[] args) {
		int a[] = {0,0,1,2,0,0,3,4,0,5,0,0};
		int len = a.length;
		sol(a);

		//		for(int i=0; i<len; i++) {
		//			if(a[i] != 0)
		//				continue;
		//			else {
		//				for(int j=i;j<len;j++) {
		//					if(a[j] != 0) {
		//						int temp = a[i];
		//						a[i]=a[j];
		//						a[j]=temp;
		//						break;
		//					}
		//				}
		//			}
		//		}


	}

	public static void sol(int[] arr) {

		int r = arr.length-1, l=0;
		int ptr = 0;
		while (l < r) {
			if(arr[l] != 0) {
				int temp = arr[l];
				arr[l] = arr[ptr];
				arr[ptr] = temp;
				ptr++;
			}
			l++;
		}
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
}
