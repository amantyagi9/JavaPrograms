package com.aman.interview;

public class DuplicateInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 2, 3, 4, 5, 7, 8, 4, 3};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					System.out.println("Duplicate Element: " + arr[j]+" at position "+i);
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
