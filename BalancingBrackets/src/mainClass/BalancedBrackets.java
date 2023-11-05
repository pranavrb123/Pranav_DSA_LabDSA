package mainClass;

import serviceClass.ServiceClass;

public class BalancedBrackets {

	public static void main(String[] args) {

		String input = "{ [ ( ( ) ) ] }";

		if (ServiceClass.isBalanced(input)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered String does not contain Balanced Brackets");
		}

	}

}
 