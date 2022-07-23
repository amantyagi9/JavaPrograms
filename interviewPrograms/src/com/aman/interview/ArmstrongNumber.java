package com.aman.interview;

public class ArmstrongNumber {

	public static void main(String[] args) {

		/*
		 * A number is called Armstrong num if it is equal to sum of its digits each
		 * raised to the power of number of digits in it. Ex:-153=1^3+5^3+3^3=1+125+27
		 * 371, 407, 9474, 54748
		 */

		checkArmstrongNumber(153);
		checkArmstrongNumber(371);
		checkArmstrongNumber(407);
		checkArmstrongNumber(9474);
		checkArmstrongNumber(361);
		checkArmstrongNumber(3673);

	}

	static void checkArmstrongNumber(int num) {
		int number = num;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;

		while (number != 0) {
			int lastDigit = number % 10;
			int lastNumPower = 1;
			for (int i = 0; i < noOfDigits; i++) {
				lastNumPower = lastNumPower * lastDigit;
			}
			sum = sum + lastNumPower;
			number = number / 10;
		}

		if (sum == num) {
			System.out.println(num + " : is an Armstrong Number");
		} else {
			System.out.println(num + " : is NOT an Armstrong Number");
		}
	}

}
