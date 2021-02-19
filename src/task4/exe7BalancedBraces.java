package task4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exe7BalancedBraces {
	public static void main(String[] args) {
		System.out.println("Enter expression");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(isBalanced(str));
	}

	public static boolean isBalanced(String str) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
 		for(int i=0;i<str.length();i++) {
 			char s =str.charAt(i);
 			
 			if(s=='(' || s=='{' || s=='[') {
 				stack.push(s);
 				continue;
 			}
 			
 			if(stack.isEmpty())
 				return false;
 			
 			char temp;
 			switch(s) {
 			case ')':
 				temp = stack.pop();
 				if(temp == '{' || temp == '[')
 					return false;
 				break;
 				
 			case '}':
 				temp = stack.pop();
 				if(temp == '(' || temp == '[')
 					return false;
 				break;
 				
 			case ']':
 				temp = stack.pop();
 				if(temp == '{' || temp == '(')
 					return false;
 				break;
 				
 			}
 		}
 		
 		return(stack.isEmpty());
	}
}
