package com.aman.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

		// creating a stream of integers.....Stream.of()
		System.out.println("****Stream of integers**********");

		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		s1.forEach(i -> System.out.println(i));


		// creating a stream of array.....Stream.of(array)
		System.out.println("****Stream of array**********");
		
		Stream<Integer> s2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		s2.forEach(i -> System.out.println(i));


		// stream form a list........List.stream()
		System.out.println("*****Stream from a List********");
		
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i<10; i++) {
			list.add(i);
		}
		
		Stream<Integer> s3 = list.stream();
		s3.forEach(i -> System.out.println(i));
		
		
		/* In the given example, we are creating a stream from generated elements. 
		This will produce a stream of 20 random numbers.
		We have restricted the elements count using limit() function.
		Stream.generate() or Stream.iterate()
		*/
		System.out.println("*****stream from generated elements********");
		
		Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100));
		randomNumbers.limit(20).forEach(i -> System.out.println(i));
		
		
		// Stream of String chars or tokens
		System.out.println("*****Stream of String chars or tokens********");
		
		IntStream s4 = "12345_abcdefg".chars();
		s4.forEach(i -> System.out.println(i));
		
		//or
		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
		stream.forEach(p -> System.out.println(p));
		
		
		
		
		
	}

}
