package com.aman.interview;

public class SecondLargestElementInIntArray {

	public static void main(String[] args) {

		int[] arr1 = { 5, 43, 36, 28, 8, 65, 3, 16, 57, 34, 23, 12 };
		int[] arr2 = { 76, 24, 36, 48, 97, 85, 83, 16, 97, 94, 23, 12 };

		System.out.println(secondLargest(arr1));
		System.out.println(secondLargest(arr2));

	}

	static int secondLargest(int[] arr) {

		int first;
		int second;

		if (arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
		}
		return second;
	}
}
