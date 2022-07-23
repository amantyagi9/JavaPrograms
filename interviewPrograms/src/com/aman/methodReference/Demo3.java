package com.aman.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Reference to an Instance Method

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 12, 433, 5, 666);

		Optional<Integer> max = integers.stream().reduce(Math::max);

		max.ifPresent(System.out::println);  // println is a non static method

	}

}
