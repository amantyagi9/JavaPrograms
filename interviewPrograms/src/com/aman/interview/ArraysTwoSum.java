package com.aman.interview;

import java.util.HashMap;
import java.util.Map;

public class ArraysTwoSum {

	public static void main(String[] args) {

		int[] a = { -1, 4, 45, 6, 10, 8 };
		int n = 16;
		printPairIndex(a, n);
		printPairs(a, n);

	}

	static void printPairIndex(int[] arr, int sum) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)	{
			int temp=sum-arr[i];
			if(map.containsKey(temp)) {
				System.out.println("pair index with given sum "+sum+ " is : "+
									map.get(temp)+" , "+i);
			}
			map.put(arr[i], i);
		}
	}

	static void printPairs(int[] arr, int sum) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)	{
			int temp=sum-arr[i];
			if(map.containsKey(temp)) {
				System.out.println("pair with given sum "+sum+ " is : "+
									temp+ " , "+arr[i]);
			}
			map.put(arr[i], i);
		}
	}
	
}
