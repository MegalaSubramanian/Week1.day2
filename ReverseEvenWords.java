package week1.day2.Assessment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.println("Input = "+test);
		System.out.print("Reverse Even Word = ");
		String[] split = test.split(" ");
		int count = 1;
		for (int i = 0; i < split.length; i++) {
			if (count % 2 == 1) {
				System.out.print(split[i] + " ");
				count++;
			} else {
				String evenWord = split[i], reverse = "";
				int length = split[i].length();

				for (int j = 0; j < length; j++) {
					char temp = evenWord.charAt(j);
					reverse = temp + reverse;
				}
				System.out.print(reverse + " ");
				count++;

			}

		}
	}
}
