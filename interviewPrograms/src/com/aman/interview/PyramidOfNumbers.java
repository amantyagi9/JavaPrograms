package com.aman.interview;

import java.util.Scanner;

public class PyramidOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows you want?");
		int n = scan.nextInt();

		int rowCount = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();

			rowCount++;
		}
		
		scan.close();
	}
}
