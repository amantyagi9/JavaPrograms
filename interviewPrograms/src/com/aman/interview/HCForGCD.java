package com.aman.interview;

import java.util.Scanner;

public class HCForGCD {

	public static void main(String[] args) {

//		find GCD or HCF (highest common factor) of two numbers.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		
		System.out.println("HCF/GCD of given numbers is "+gcd(a, b));
		hcf(a, b);
		
		scan.close();
	}
	
//	using loop
	static void hcf(int a, int b) {
		int hcf = 0;

		for (int i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
	}
	
//	using recursive method
	static int gcd(int a , int b) {
		if(b==0) return a;
		
		return gcd(b, a%b);
	}
}
