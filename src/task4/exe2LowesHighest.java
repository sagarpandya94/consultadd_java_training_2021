package task4;

public class exe2LowesHighest {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int shortestIndex=0, highestIndex=0, sum=0;
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]<array1[j])
					shortestIndex=j;
			}
		}
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]>array1[j])
					highestIndex=j;
			}
		}
		
		for(int i=0;i<array1.length;i++) {
			if(i==shortestIndex || i==highestIndex)
				continue;
			sum+=array1[i];
		}
		
		System.out.println("the sum is" + sum);
	}
}
