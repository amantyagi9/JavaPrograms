package com.aman.pattern;

public class StarPattern8 {

	public static void main(String[] args) {
		
/*    Right Pascal’s Triangle
 
				* 
				* * 
				* * * 
				* * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				*

 */
		int s = 1;
		
		for(int i =1; i<=9; i++) {
			for(int j=1; j<=s; j++) {
				System.out.print("*");
			}
			
			if(i<=9/2) {
				s++;
			}
			else {
				s--;
			}
			System.out.println();
		}

	}

}
