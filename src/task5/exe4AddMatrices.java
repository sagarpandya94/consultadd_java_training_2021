package task5;

public class exe4AddMatrices {
	public static void main(String[] args) {
		
		int a[][] = {{3,5,1},{9,8,5},{4,7,5}};
		int b[][] = {{2,7,8},{0,6,9},{9,8,9}};
		
		int sum[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
