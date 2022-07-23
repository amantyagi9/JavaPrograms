package com.aman.interview;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {

		String s = "Java is OOP";

		System.out.println(removeSpace(s));

//		using inbuild method
		System.out.println(s.replaceAll("\\s", ""));

	}

	public static String removeSpace(String s) {
		String str = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				str = str + s.charAt(i);
			}
		}
		return str;

	}

}
