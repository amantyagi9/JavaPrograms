package com.aman.interview;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number: ");
		int b = scan.nextInt();

		System.out.println("LCM of given numbers is: " + lcm(a, b));
		lcm2(a, b);

		scan.close();
	}

//	using gcd --recursive
	static int gcd(int a, int b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

//	without gcd...using loop
	static void lcm2(int a, int b) {

		int max, temp, lcm = 0;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		temp = max;

		while (a != 0) {
			if (max % a == 0 && max % b == 0) {
				lcm = max;
				break;
			}
			max = max + temp;
		}
		System.out.println("LCM of given numbers is:: " + lcm);

	}

}
