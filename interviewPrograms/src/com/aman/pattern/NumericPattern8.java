package com.aman.pattern;

public class NumericPattern8 {

	public static void main(String[] args) {

		
/*

			10101
			01010
			10101
			01010
			10101

 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
		
			System.out.println();
		}
		
		
	}

}
