package com.aman.pattern;

public class CharPattern5 {

	public static void main(String[] args) {

		
/* 

		     A
		    B B
		   C   C
		  D     D
		 E       E
		F         F
		 E       E
		  D     D
		   C   C
		    B B
		     A
		     
 */
		
		int alpha = 65;
		int s = 5;
		int l = 0;
		int m = 0;
		
		for(int i = 0; i<= 10; i++) {
			for(int j = 0; j<s; j++) {
				System.out.print(" ");
			}
			
			for(int k =0 ;k<=l; k++) {
				if(k==0 || k==l) {
					System.out.print((char)(alpha + m));
				}
				else {
					System.out.print(" ");
				}
			}
			
			if(i < 10/2) {
				s--;
				l = l+2;
				m++;
			}
			else {
				s++;
				l = l-2;
				m--;
			}
			
			System.out.println();
		}
		
		
	}

}
