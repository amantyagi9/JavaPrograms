package com.aman.interview;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,6,8, 10, 16,7};

		int[] a = oddEven(arr);
		for(int i: a) {
			System.out.println("Array: "+i);
		}
		System.out.println(Arrays.toString(a));
		
	}
	
	static int[] oddEven(int[] arr) {
		int left=0;
		int right = arr.length-1;
		for(int i=0;i<arr.length;i++) {
			while(arr[left]%2==0) {
				left++;
			}
			while(arr[right]%2==1) {
				right--;
			}
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
		
		}
		}
		return arr;
		
		
		
		
		
		
	}
	
	
}