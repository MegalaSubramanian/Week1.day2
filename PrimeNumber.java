package week1.day2.Assessment;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, input = 13, isprime = 1;
		{
		if ( input == 0 || input == 1) {
			System.out.println(input + " is not prime number");
		} else {
			for (i = 2; i < input/2; i++) {
				if (input % i == 0) {
					System.out.println(input + " is not a prime number");
					isprime = 0;
					break;
				} 
			}
			if(isprime == 1) {
					
					System.out.println(input + " is a prime number");
				}
			}
		}
	}
}
