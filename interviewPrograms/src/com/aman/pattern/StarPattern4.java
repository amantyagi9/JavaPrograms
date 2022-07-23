package com.aman.pattern;

public class StarPattern4 {

	public static void main(String[] args) {
	/*              
			 	   * 
		         * * 
		       * * * 
		     * * * * 
		   * * * * * 
   
	 */

// First Method
		
	for(int i = 1; i<=5; i++) {
		for(int j = i;j<5;j++) {
			System.out.print(" ");
		}
		for(int k =1; k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
// Second Method
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if((i+j)>=6) {
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
