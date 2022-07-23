package com.aman.interview;

import java.util.Scanner;

public class DecimalToOctal {

public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Decimal Number: ");
	int number=scan.nextInt();
	int n=number;
	String octal="";
	int rem=0;
	while(n>0) {
		rem=n%8;
		octal=rem+octal;
		n=n/8;
	}
	System.out.println("Octal equivalanet to "+number+ " is "+octal);
	scan.close();
}
}
