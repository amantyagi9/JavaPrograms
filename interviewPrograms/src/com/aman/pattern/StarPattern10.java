package com.aman.pattern;

public class StarPattern10 {

	public static void main(String[] args) {
		
		/*
		  Sandglass Star Pattern
		  
					* * * * * 
					 * * * * 
					  * * * 
					   * * 
					    * 
					    * 
					   * * 
					  * * * 
					 * * * * 
					* * * * * 

		 */
		
		int s = 1;
		int t = 5;
		for(int i= 1; i<= 10; i++) {
			for(int j=1; j<s; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=t; k++) {
				System.out.print("* ");
			}
			if(i<=5) {
				s++;
				t--;
			}
			if(i>=5) {
				s--;
				t++;
			}
			
			System.out.println();
		}

	}

}
