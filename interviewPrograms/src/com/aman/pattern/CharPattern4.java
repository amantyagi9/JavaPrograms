package com.aman.pattern;

public class CharPattern4 {
	
	public static void main(String[] args) {
		
/*

		     A 
		    A B 
		   A B C 
		  A B C D 
		 A B C D E 
		A B C D E F

 */
		
		int alpha = 65;
		
		for(int i = 0; i<=5; i++) {
			for(int j= i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print((char)(alpha + k) + " ");
			}
			
			System.out.println();
		}
		
	}

}
