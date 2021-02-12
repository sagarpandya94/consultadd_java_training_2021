package task1;

public class swapNumbers {
	public static void swapWithThirdVariable(int a, int b) {
		System.out.println("Swapping using third variable");
		System.out.println("Before swap");
		System.out.println("A is: " + a + " B is: " + b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap");
		System.out.println("A is:" + a + "B is:" + b);
	}

	public static void swapWithoutThirdVariable(int a, int b) {
		System.out.println("Swapping without using third variable");
		System.out.println("Before swap");
		System.out.println("A is: " + a + " B is: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap");
		System.out.println("A is:" + a + "B is:" + b);
	}
	
	public static void main(String[] args) {
		swapWithThirdVariable(5,7);
		swapWithoutThirdVariable(18,55);
	}
}
