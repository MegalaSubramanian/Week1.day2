package week1.day2.Assessment;

public class Factorial {
	static int input = 5, factorial = 1;
	public static void main(String[] args) {
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorization value of "+input+" is " + factorial);
	}

}
