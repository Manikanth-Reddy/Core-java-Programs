   package codes;

import java.util.Stack;

public class StringBalance {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "";
		if (isBalance("[()]"))
			System.out.println("String is balanced");
		else
			System.out.println("String is not balanced");
	}
	static boolean isBalance(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(')
				stack.push(c);
			else if (c == ']' || c == '}' || c == ')') {
//				if(stack.isEmpty()) return false;
//				char c2=stack.pop();
//				if(!pair(c2, c)) return false;
				if ((stack.isEmpty()) || (!pair(stack.pop(), c)))
					return false;
			}
		}
//		if(stack.isEmpty()) return true;
//		else return false;
		return stack.isEmpty();
	}
	static boolean pair(char c2, char c) {
//		if(ch1=='['&& ch2==']') return true;
//		if(ch1=='{'&& ch2=='}') return true;
//		if(ch1=='('&& ch2==')') return true;
		if ((c2 == '[' && c == ']') || (c2 == '{' && c == '}') || (c2 == '(' && c == ')'))
			return true;
		else
			return false;
	}
}
