package com.aman.interview;

public class StringCharacterOccurance {

	public static void main(String[] args) {

		characterCount("banana");
		System.out.println("=============");
		characterCount("All is Well");
		System.out.println("=============");
		characterCount("Done and Gone");
		System.out.println("=============");
		characterCount("Java j2ee JSP");

	}

	static void characterCount(String s) {
		
		String s1=s.replaceAll("\\s", "").toLowerCase();
		String s2 = "";
		int count = 0;
		char c;
		for (int i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			count = s1.length() - s1.replace("" + c, "").length();
			if (s2.indexOf(c) == -1) {
				s2 = s2 + c;
				System.out.println(c + " = " + count);
			}
		}

	}

}
