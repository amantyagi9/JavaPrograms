package com.aman.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		//Stream Collectors
		
		// Collect Stream elements to a List
		
		List<Integer> list1 = new ArrayList<>();
		for(int i = 1; i<10; i++) {
			list1.add(i);
		}
		
		Stream<Integer> stream1 = list1.stream();
		List<Integer> evenNumList = stream1.filter( i -> (i%2 == 0))
											.collect(Collectors.toList());
		System.out.println(evenNumList);
		
		
		//Collect Stream elements to an Array
		
		List<Integer> list2 = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list2.add(i);
		}

		Stream<Integer> stream2 = list2.stream();
		Integer[] evenNumbersArr = stream2.filter(i -> i%2 == 0).toArray(Integer[]::new);
		for(int i: evenNumbersArr) {
			System.out.println(i);
		}
		//or
		System.out.println(Arrays.toString(evenNumbersArr));
		
		
		
		
		
	}

}
