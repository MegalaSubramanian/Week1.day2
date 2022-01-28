package week1.day2.Assessment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNumber = 0, secondNumber = 1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 1; i <= range; i++) {

			int sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			firstNumber = sum;
			System.out.println(sum);
		}

	}

}
