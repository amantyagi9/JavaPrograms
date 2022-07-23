package com.aman.interview;

public class ReverseInteger {

	public static void main(String[] args) {

		revNumber(54321);

	}

	static void revNumber(int n) {

		int reversed = 0;
		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed Number is: "+reversed);
	}

}
