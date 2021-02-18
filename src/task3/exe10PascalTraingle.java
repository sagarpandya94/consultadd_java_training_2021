package task3;

import java.util.Scanner;

public class exe10PascalTraingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		
		int pTri[][] = new int[rows][rows];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j || j==0) {
					pTri[i][j]=1;
				}
				else {
					pTri[i][j]=pTri[i-1][j-1] + pTri[i-1][j];
				}
				System.out.print(pTri[i][j]);
			}
			System.out.println("");
		}
	}

}
