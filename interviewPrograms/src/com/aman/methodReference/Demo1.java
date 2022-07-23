package com.aman.methodReference;

// Reference to a Static Method

public class Demo1 {

	public static void main(String[] args) {

		// using Lambda expression
		A a1 = s -> System.out.println(s);
		a1.getName("executing using Lambda...");
		
		// using method reference
		A  a2 = Demo1::getInfo;
		a2.getName("executing using method reference...");

	}
	
	
	public static void getInfo(String info) {
		System.out.println(info);
	}
	
	
}


interface A{
	
	public void getName(String name);
}