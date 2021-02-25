package task5;

public class exe6RemoveDuplicateAddZero {
	public static void main(String[] args) {
		int a[] = {2,2,3,3,4,5,5,5,8,8,8,8};
		int len = a.length;
		
		for(int i=0; i<len; i++) {
			for (int j=i+1;j<len; j++) {
				if(a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		
		for(int i=0; i<len; i++) {
			if(a[i] != 0)
				continue;
			else {
				for(int j=i;j<len;j++) {
					if(a[j] != 0) {
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
		}
		
		for(int i=0;i<len;i++) {
			System.out.println(a[i] + " ");
		}
	}

}
