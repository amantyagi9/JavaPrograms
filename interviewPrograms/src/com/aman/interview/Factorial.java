package com.aman.interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
//		factorial of a number n!=n(n-1)(n-2).....
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is :"+fact);
		
		System.out.println("using Recursive method: "+factorial(n));
		scan.close();
	}
	
//	using recursive method
	
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
	}
}
