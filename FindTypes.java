package week1.day2.Assessment;

public class FindTypes {

	public static void main(String[] args) {
		String input = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] ch = new char[input.length()];
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < input.length(); i++) {
			ch[i] = input.charAt(i);
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				specialChar++;
			}
		}
		System.out.println("The Number of Letters in the given input is : " + letter);
		System.out.println("The Number of Spaces in the given input is : " + space);
		System.out.println("The Number of Numbers in the given input is : " + num);
		System.out.println("The Number of Special Characters in the given input is : " + specialChar);
	}

}
