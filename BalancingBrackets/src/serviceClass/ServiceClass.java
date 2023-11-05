package serviceClass;

import java.util.Stack;

public class ServiceClass {

	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' || c == ']' || c == '}') {
				if (stack.isEmpty()) {
					return false; // Unbalanced, as there's no opening bracket for the current closing bracket
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					return false; // Unbalanced, as the brackets do not match
				}
			}
		}

		return stack.isEmpty(); // If the stack is empty, all brackets are balanced.
	}

}
