package task2;

public class exe5PrintNumbers {
	public static void main(String[] args) {
		System.out.println(0);
		for(int i=0;i<7;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
}
