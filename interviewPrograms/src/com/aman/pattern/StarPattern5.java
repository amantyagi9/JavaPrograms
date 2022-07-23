package com.aman.pattern;

public class StarPattern5 {
	
	public static void main(String[] args) {
		
		
		/*   Diamond shape
		  
				    *
				   ***
				  *****
				 *******
				*********
				 *******
				  *****
				   ***
				    *

		 
		 */
		
		int s = 4;
		int l = 1;
		
		for(int i = 1; i<= 9; i++) {
			for(int j = 1; j<=s; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=l; k++) {
				System.out.print("*");
			}
			
			if(i<=9/2) {
				s--;
				l= l+2;
			}
			else {
				s++;
				l = l-2;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
