package com.aman.pattern;

public class StarPattern2 {

	public static void main(String[] args) {

		/*
		  
		  *****
		  ****
		  ***
		  **
		  *
		 
		 
		 */
		
// first method 
		
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
// second method
		
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if((i+j)<=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
