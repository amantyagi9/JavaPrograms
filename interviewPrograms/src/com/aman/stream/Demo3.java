package com.aman.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//********** Stream Operations ************

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Amit");
		memberNames.add("Rahul");
		memberNames.add("Shikhar");
		memberNames.add("Saurav");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//  Intermediate Operations --- Stream.filter()
		memberNames.stream().filter(s -> s.startsWith("S"))
								.forEach(System.out::println);
		
		System.out.println("=================");
		
		//  Intermediate Operations --- Stream.map()
		memberNames.stream().filter(s -> s.startsWith("S"))
								.map(String::toUpperCase)
									.forEach(System.out::println);
		System.out.println("=================");
		
		//  Intermediate Operations ---  Stream.sorted()
		memberNames.stream().sorted()
							  .map(String::toUpperCase)
							    .forEach(System.out::println);
		System.out.println("==================");
		
		// Terminal operations --- Stream.forEach()
		memberNames.forEach(System.out::println);
		System.out.println("==================");
		
		// Terminal operations ---  Stream.collect()
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

		System.out.print(memNamesInUppercase);
		
		System.out.println("==================");
		
		// Terminal operations ---  Stream.match()
		boolean result1 = memberNames.stream()
										.anyMatch(s -> s.startsWith("S"));
		System.out.println(result1);
		
		boolean result2 = memberNames.stream()
										.allMatch(s -> s.startsWith("S"));
		System.out.println(result2);						

		boolean result3 = memberNames.stream()
										.noneMatch(s -> s.startsWith("A"));
		System.out.println(result3);						

        System.out.println("==================");
		
		// Terminal operations --- Stream.count()
		long totalMatched = memberNames.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(totalMatched);
		
		System.out.println("==================");
		
		// Terminal operations --- Stream.reduce()
		Optional<String> result = memberNames.stream().reduce((s1, s2) -> s1 + "#" +s2);
		result.ifPresent(System.out::println);
		
		System.out.println("==================");
		
		// Short-circuit Operations --- Stream.anyMatch()
		boolean matched = memberNames.stream()
										.anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matched);  
		

		System.out.println("==================");
		
		// Short-circuit Operations --- Stream.findFirst()
		String firstMatchedName = memberNames.stream()
	            .filter((s) -> s.startsWith("S"))
	            	.findFirst()
	                        .get();
	 
		System.out.println(firstMatchedName); 
				
		
		
		
	}

}
