package com.aman.interview;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
		
		leapYear(year);
		leapYear2(year);

		scan.close();
	}

//	1st method
	static void leapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is NOT a leap year.");
		}
	}

//	2nd method

	static void leapYear2(int year) {
		boolean status = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					status = true;
				} else {
					status = false;
				}
			} else {
				status = true;
			}
		} else {
			status = false;
		}

		if (status) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is NOT a leap year.");
		}

	}
}
