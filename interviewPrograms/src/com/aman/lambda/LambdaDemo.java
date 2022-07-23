package com.aman.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {

		List<Person> person = Arrays.asList(new Person("Aman", "Tyagi", 27), 
				new Person("John", "Miller", 26),
				new Person("Amit", "Jaiswal", 23), 
				new Person("Rohit", "Sharma", 29),
				new Person("Mohit", "Sharma", 30));

//		using Java 7
		 Collections.sort(person, new Comparator<Person>() {
		 
		 @Override public int compare(Person p1, Person p2) { 
			 return p1.getLastName().compareTo(p2.getLastName()); 
		 }
		 });
		printAll(person);

		System.out.println("====================");
		
//		using Java 8 lambda
		Collections.sort(person, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printAll(person);

	}

	public static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
