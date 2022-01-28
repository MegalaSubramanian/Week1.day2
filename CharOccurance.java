package week1.day2.Assessment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char value = 'e';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == value) {
				count++;
			}
		}
		System.out.println("The character '" + value + "' is present " + count + " times in the given input '"+str+"'");
	}
}
