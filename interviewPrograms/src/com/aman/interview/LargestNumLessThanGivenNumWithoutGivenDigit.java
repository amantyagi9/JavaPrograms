package com.aman.interview;

public class LargestNumLessThanGivenNumWithoutGivenDigit {

	public static void main(String[] args) {

		/*
		 * for ex:-145 is given number, then find the largest number but less than 145
		 * and it should not contain 4 in it. So in this case 139 will be the number
		 */
		System.out.println(getTheNumber(145, 4));
		System.out.println(getTheNumber(345, 5));
		System.out.println(getTheNumber(34145, 4));
		System.out.println(getTheNumber(1454, 5));

	}

	static int getTheNumber(int number, int digit) {

		char c = Integer.toString(digit).charAt(0);

		for (int i = number; i > 0; i--) {
			if (Integer.toString(i).indexOf(c) == -1) {
				return i;
			}
		}
		return -1;

	}

}
