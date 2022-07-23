package com.aman.interview;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int number=scan.nextInt();
		int n=number;
		String binary="";
		int rem=0;
		while(n>0) {
			rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		System.out.println("binary equivalanet to "+number+ " is "+binary);
		scan.close();
	}
}
