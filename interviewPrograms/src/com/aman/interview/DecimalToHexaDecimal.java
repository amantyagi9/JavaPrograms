package com.aman.interview;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int number=scan.nextInt();
		int n=number;
		String hexa="";
		char[] hexaDecimal= {'0','1','2','3','4','5','6','7','8','9',
							'A','B','C','D','E','F'};
		int rem=0;
		while(n>0) {
			rem=n%16;
			hexa=hexaDecimal[rem]+hexa;
			n=n/16;
		}
		System.out.println("HexaDecimal equivalanet to "+number+ " is "+hexa);
		scan.close();
	}
}
