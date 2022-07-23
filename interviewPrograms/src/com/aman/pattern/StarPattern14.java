package com.aman.pattern;

public class StarPattern14 {

	public static void main(String[] args) {

		/*
			Diamond Star Pattern


					    *
					   * *
					  *   *
					 *     *
					*       *
					 *     *
					  *   *
					   * *
					    *
    
		 */
		
		int s = 5;
		int t = 1;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j < s; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= t; k++) {
				if (k == 1 || k == t) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= 9 / 2) {
				s--;
				t = t + 2;
			} else {
				s++;
				t = t - 2;
			}

			System.out.println();
		}
		
		
	}

}
