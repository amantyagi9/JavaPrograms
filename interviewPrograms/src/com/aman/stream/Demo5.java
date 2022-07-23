package com.aman.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// ******** Java 9 Stream Improvements ********

public class Demo5 {


	public static void main(String[] args) {
		
		
		// takeWhile() Method ----- takes each element that matches its predicate. 
		//It stops when it get unmatched element.
		
		List<Integer> list1 = Stream.of(1,2,3,4,5,6,7,8,9)
									.takeWhile(i -> i % 2 == 0)
										.collect(Collectors.toList());
		System.out.println(list1); // This example returns an empty list because 
		//it fails at first list element, and takewhile stops here.
				
		
		List<Integer> list2 = Stream.of(2,2,3,4,5,6,7,8,9)
									.takeWhile(i -> i % 2 == 0)
										.collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
		 
		List<String> subset1 = alphabets
		        .stream()
		        .takeWhile(s -> !s.equals("d"))
		        .collect(Collectors.toList());
		 
		System.out.println(subset1);
		 
		
		//dropWhile() Method
	    List<Integer> list3 = Stream.of(2,2,3,4,5,6,7,8,9,10)  
	    				   			   .dropWhile(i -> (i % 2 == 0))
	    									.collect(Collectors.toList());     
	    System.out.println(list3);  
		
	    List<String> alphabets2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
	    
	    List<String> subset2 = alphabets2
	            .stream()
	            .dropWhile(s -> !s.equals("d"))
	            .collect(Collectors.toList());
	     
	    System.out.println(subset2);
		
	    
	    
	    // iterate() method
	    // iterate method in Java 8
	    List<Integer> numbers1 = Stream.iterate(1, i -> i+1)
                .limit(10)
                .collect(Collectors.toList());

	    System.out.println(numbers1);
	    
	    // iterate method in Java 9
	    List<Integer> numbers2 = Stream.iterate(1, i -> i <= 10, i -> i+1)
	    									.collect(Collectors.toList());
	    System.out.println(numbers2);
	    
		
	    // ofNullable() -- creates a single-element stream which wraps a value if not null,
	    //or is an empty stream otherwise.
	    Stream<String> stream = Stream.ofNullable("123");
	    System.out.println(stream.count());
	     
	    stream = Stream.ofNullable(null);
	    System.out.println(stream.count());
	}

}
