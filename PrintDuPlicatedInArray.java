package week1.day2.Assessment;

public class PrintDuPlicatedInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		System.out.println("The Duplicate integers in array are");
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("The total no of Duplicated in the array = " + count);
	}
}
