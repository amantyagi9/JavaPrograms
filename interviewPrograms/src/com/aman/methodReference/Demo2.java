package com.aman.methodReference;

// Reference to an Instance Method

public class Demo2 {

	public static void main(String[] args) {

		// Referring non-static method using reference
		Demo2 d = new Demo2();
		Sayable sb = d::saySomething;
		sb.say();

		// Referring non-static method using anonymous object
		Sayable sb1 = new Demo2()::saySomething;
		sb1.say();
	}

	public void saySomething() {
		System.out.println("Hello, this is a non-static method.");
	}

}

interface Sayable {

	public void say();
}