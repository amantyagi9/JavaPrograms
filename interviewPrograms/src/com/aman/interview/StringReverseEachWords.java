package com.aman.interview;

public class StringReverseEachWords {

	public static void main(String[] args) {

		reverseString("reverse me");
		reverseString("java j2ee jsp");
		

	}

	static void reverseString(String s) {

		String[] arr = s.split(" ");
		String reverseString = "";

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord +" ";

		}
		System.out.println(reverseString);
	}

}
