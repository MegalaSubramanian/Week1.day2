package week1.day2.Assessment;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7, 8 };
		Arrays.sort(arr);
		System.out.println("The sorted order of the array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != (i + 1)) {
				System.out.println("The missing element in the above iteration is:' " + (i + 1) + "'");
				break;
			}
		}
	}
}
