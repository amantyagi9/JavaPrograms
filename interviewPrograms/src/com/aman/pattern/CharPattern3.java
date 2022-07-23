package com.aman.pattern;

public class CharPattern3 {

	public static void main(String[] args) {

		
/* 

		A B C D E F 
		A B C D E 
		A B C D 
		A B C 
		A B 
		A 
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 
		A B C D E F 

 */
		
		int alpha = 65;
		int s = 5;
		
		for(int i = 0; i<= 11; i++) {
			for(int j = 0; j<= s; j++) {
				System.out.print((char)(alpha + j) + " ");
			}
			
			if(i <= 11/2) {
				s--;
			}
			if(i >= 11/2) {
				s++;
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
