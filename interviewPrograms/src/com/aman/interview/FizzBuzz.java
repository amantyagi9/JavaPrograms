package com.aman.interview;

public class FizzBuzz {

	public static void main(String[] args) {
		
		/*
		 * write a program that prints each number from 1 to 100 on a new line. 
		 * for each multiple of 3 , print "Fizz" instead of number 
		 * for each multiple of 5 , print "Buzz" instead of number
		 *  for numbers which are multiples of 3 and 5 , print
		 * "FizzBuzz" instead of number
		 */
		
		
		printFizzBuzz(100);
		
		
	}
	
	public static void printFizzBuzz(int n) {
		
		for(int i=1;i<=n;i++) {
			if((i%3==0)&&(i%5==0)) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
