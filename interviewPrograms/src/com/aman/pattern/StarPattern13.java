package com.aman.pattern;

public class StarPattern13 {

	public static void main(String[] args) {

/*
		Down triangle

					*********
					 *     *
					  *   *
					   * *
					    *
					    
 */
		
		
		for(int i= 5; i>=1; i--) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for(int k= 1; k<=(2*i - 1); k++) {
				if(k== 1 || k== (2*i - 1) || i == 5) {
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
