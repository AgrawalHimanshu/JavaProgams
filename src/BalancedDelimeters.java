import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedDelimeters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Series of Delimeters");
		String str = scanner.next();
		boolean result = balance(str);

		System.out.println(result);

	}

	public static boolean balance(String str) {
		HashMap<String, String> delimMap = new HashMap<String, String>();
		delimMap.put("{", "}");
		delimMap.put("(", ")");
		delimMap.put("[", "]");

		Stack<Character> delimStack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			/*System.out.print((str.charAt(i)));
			System.out.print((String.valueOf(str.charAt(i))));
			System.out.print(delimMap.containsKey(String.valueOf(str.charAt(i))));*/
			if (delimMap.containsKey(String.valueOf(str.charAt(i)))) {
				
				delimStack.push(str.charAt(i));
			} else {
				if (!delimStack.empty()) {
					String lastOpen = delimStack.pop().toString();
					if (!delimMap.get(lastOpen).equals(String.valueOf(str.charAt(i)))) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		if (!delimStack.empty()) {
			return false;
		}
		return true;
	}
}
