package algo.sorting;

import java.util.Stack;

public class ValidParenthisis {
	
	public static void main(String[] args) {
		String str = "()()()";
		Stack s1 = new Stack();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				s1.push(str.charAt(i));
			}
			else if(str.charAt(i) == ')') {
				if(s1.isEmpty()) {
					System.out.println("Invalid string");
					return ;
				}
				s1.pop();
			}
		}
		if(!s1.isEmpty()) {
			System.out.println("Invalid string");
		}
		else {
			System.out.println("Valid string");
		}

	}

}
