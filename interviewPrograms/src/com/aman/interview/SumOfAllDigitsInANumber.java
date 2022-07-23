package com.aman.interview;

import java.util.Scanner;

public class SumOfAllDigitsInANumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scan.nextInt();

		int n = number;
		int sum = 0;
		while (n != 0) {
			int lastdigit = n % 10;
			sum = sum + lastdigit;
			n = n / 10;
		}
		System.out.println("Sum of all digits in " + number + " is " + sum);

		scan.close();

	}
}