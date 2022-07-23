package com.aman.pattern;

public class StarPattern12 {

	public static void main(String[] args) {

		/*
		 
		Triangle Star pattern		
		
				    *
				   * *
				  *   *
				 *     *
				*********
		 
		 */
		
	
	
		
		for(int i=1; i<=5; i++) {
			for(int j= i; j<5 ; j++ ) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*i - 1); k++) {
				if(k == 1 || k == (2*i - 1) || i == 5 ) {
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
