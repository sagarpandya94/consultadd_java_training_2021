package task2;

import java.util.*;

public class divisibleBy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		if(x%3==0 && x%5==0)
			System.out.println("ConsultAdd Java Training");
		else if(x%3==0)
			System.out.println("Consultadd");
		else if(x%5==0)
			System.out.println("Java Training");
		else
			System.out.println("Number not divisible by 5 or 3");
	}

}
