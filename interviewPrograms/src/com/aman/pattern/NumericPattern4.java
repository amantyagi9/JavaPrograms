package com.aman.pattern;

public class NumericPattern4 {

	public static void main(String[] args) {
		
/* 
 
			   1
			  212
			 32123
			4321234
			 32123
			  212
			   1


 */    

		
			int s = 4;
			int n = 1;
			
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j < s; j++) {
					System.out.print(" ");
				}
			
				int num = n / 2 + 1;
				for (int k = 1; k <= n; k++) {
					System.out.print(num);
			
					if (k <= n / 2) {
						num--;
					} else {
						num++;
					}
				}
			
				if (i <= 7 / 2) {
					s--;
					n = n + 2;
				} else {
					s++;
					n = n - 2;
				}
			
				System.out.println();
			}

		
		
	}
}
