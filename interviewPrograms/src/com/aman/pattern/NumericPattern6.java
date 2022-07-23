package com.aman.pattern;

public class NumericPattern6 {
	
	public static void main(String[] args) {
		
		
/*

				5 
				5 4 
				5 4 3 
				5 4 3 2 
				5 4 3 2 1
 
 */
		
		// first method
		
		for(int i = 1; i<=5; i++) {
			int k = 5;
			for(int j = 1; j<=i ; j++) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}
		
		
		
		// second method
		
//		for (int i = 5; i >= 1; i--)
//		{
//		for (int j = 5; j >= i; j--)
//		{
//		System.out.print(j+" ");
//		}
//		 
//		System.out.println();
//		}
		
		
	}

}
