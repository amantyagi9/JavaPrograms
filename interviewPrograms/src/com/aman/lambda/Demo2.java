package com.aman.lambda;

public class Demo2 {

	public static void main(String[] args) {

		//double parameters ... without return keyword
		Addable ad = (a, b) -> (a + b);

		System.out.println(ad.add(8, 4));

		//double parameters ... with return keyword
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad.add(8, 4));
		
		
		// single parameter
		Sayable s = name -> {
			return "Hello, " + name;
		};

		System.out.println(s.say("Aman"));
		
		
		//multiple statements in lambda expression  
		Sayable s1 = msg -> {
			String str1 = "I would like to  say, ";
			String str2 = str1 + msg;
			return str2;
		};
		
		System.out.println(s1.say("time is precious."));
		

	}
}

interface Addable {
	int add(int a, int b);
}

interface Sayable {
	public String say(String name);
}