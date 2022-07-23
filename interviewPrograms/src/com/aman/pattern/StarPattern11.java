package com.aman.pattern;

public class StarPattern11 {

	public static void main(String[] args) {
	
/*
 
						 ** 
						*  *
						*  *
						****
						*  *
						*  *
						*  *
						*  *


 */
		
		
		 for (int i = 1; i<=8; i++) {
			    for (int j = 1; j<= 4; j++) {
			    // prints two column lines
			    if ((j == 1 || j == 4) && i != 1 ||
			    // print first line of alphabet
			    i == 1  && j != 4 && j != 1  ||
			 	// prints middle line
			    i == 4)
			    System.out.print("*");
			    else
			    System.out.print(" ");
			    }
			    System.out.println();
		 }
		 
	}


}
