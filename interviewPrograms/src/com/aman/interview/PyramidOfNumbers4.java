package com.aman.interview;

import java.util.Scanner;

public class PyramidOfNumbers4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows you want?");
		int n = scan.nextInt();

		int rowCount=n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-i*2; j++) {
				System.out.print(" ");
			}
			for (int j = rowCount; j <= n; j++) {
				System.out.print(j + " ");
			}
			
			for(int j=n-1;j>=rowCount;j--) {
				System.out.print(j + " ");
			}
			System.out.println();

			rowCount--;
		}

		scan.close();
	}
	
}
