package com.aman.pattern;

public class StarPattern9 {

	public static void main(String[] args) {
		
	/*    Left Pascal’s Triangle
	 
				    *
				   **
				  ***
				 ****
				*****
				 ****
				  ***
				   **
				    *
    
	 */
		
		int s = 4;
		int l =1;
		
		for(int i = 1; i<= 9; i++) {
			for(int j = 1; j<=s; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<=l;k++) {
				System.out.print("*");
			}
			
			if(i<=9/2) {
				s--;
				l++;
			}else {
				s++;
				l--;
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
