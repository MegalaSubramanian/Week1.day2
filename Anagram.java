package week1.day2.Assessment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String txt1 = "stops";
		String txt2 = "posts";
		if (txt1.length() == txt2.length()) {
			char[] chartxt1 = txt1.toCharArray();
			char[] chartxt2 = txt2.toCharArray();
			Arrays.sort(chartxt1);
			Arrays.sort(chartxt2);
			if (Arrays.equals(chartxt1, chartxt2))
				;
			{
				System.out.println(txt1 + " and " + txt2 + " are Anagram");
			}
		} else {
			System.out.println(txt1 + " and " + txt2 + " are not Anagram");
		}
	}
}
