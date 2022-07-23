package com.aman.interview;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);;
		System.out.println("enter a number: ");
		int n=scan.nextInt();
		int rem;
		int sum=0;
		
		int temp=n;
		
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("integer is palindrome");
		}
		else {
			System.out.println("integer is Not palindrome");
		}
		scan.close();
	}
}
