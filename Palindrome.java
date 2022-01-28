package week1.day2.Assessment;

public class Palindrome {
	public static void main(String[] args) {
		String input = "madam", reverse = "";
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			reverse = temp + reverse;
		}
		System.out.println("The input value is: " + input);
		System.out.println("The reverse value is: " + reverse);
		boolean palindrome;
		if (palindrome = input.equalsIgnoreCase(reverse)) {
			System.out.println("Hence it is proved that " + input + " is a 'Palindrome'");
		} else {
			System.out.println("Hence it is proved that " + input + " is not a 'Palindrome'");
		}

	}
}
