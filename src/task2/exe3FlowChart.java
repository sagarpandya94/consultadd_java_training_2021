package task2;

public class exe3FlowChart {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int avg = (a+b+c)/3;
		System.out.println("Average is"+avg);
		if(avg>a && avg>b && avg>c) {
			System.out.println("Average is greater than a,b,c");
		}
		else {
			if(avg>a && avg>b) {
				System.out.println("Average is greater than a,b");
			}
			else if(avg>a && avg>c) {
				System.out.println("Average is greater than a,c");
			}
			else if(avg>b && avg>c) {
				System.out.println("Average is greater than b,c");
			}
			else if(avg>a) {
				System.out.println("Average is greater than a");
			}
			else if(avg>b) {
				System.out.println("Average is greater than b");
			}
			else if(avg>c) {
				System.out.println("Average is greater than c");
			}
		}
	}
}
