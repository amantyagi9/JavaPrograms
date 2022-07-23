package com.aman.pattern;

public class NumericPattern10 {

	public static void main(String[] args) {

		
/*

		1 2 3 4 5 
		 2 3 4 5 
		  3 4 5 
		   4 5 
		    5 
		   4 5 
		  3 4 5 
		 2 3 4 5 
		1 2 3 4 5

 */
		int s = 1;
		int l = 1;
		int n = 1;
		
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<s; j++) {
				System.out.print(" ");
			}
			for(int k = l; k<= 5; k++) {
				System.out.print(k + " ");
			}
			
			if(i <= 9/2) {
				s++;
				l++;
				n++;
			}
			else {
				s--;
				l--;
				n--;
			}
	
			
			System.out.println();
		}
		
		
		
	}

}
