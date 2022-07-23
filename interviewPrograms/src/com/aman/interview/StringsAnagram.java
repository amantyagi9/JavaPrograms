package com.aman.interview;

import java.util.Arrays;

public class StringsAnagram {

	public static void main(String[] args) {

		/*
		 * Two strings are called Anagram if they contain same set of characters but in
		 * different order. Ex:-"Dormitory- Dirty Room" "keep-peek"
		 * "schoolmaster- the classroom" "debit card- bad credit"
		 * "mother in law- hitler woman"
		 */

		String s1 = "Schoolmaster";
		String s2 = "The classroom";

		isAnagram(s1, s2);
		isAnagram("Debit card", "bad Credit");
		isAnagram("toss", "Shot");

		isAnagram2(s1, s2);
		isAnagram2("Debit card", "bad Credit");
		isAnagram2("toss", "Shot");

		isAnagram3(s1, s2);
		isAnagram3("Debit card", "bad Credit");
		isAnagram3("toss", "Shot");
	}

//	using .sort() and .equals() methods

	public static void isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		Boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		}

		else {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			char[] charArray2 = str2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			status = Arrays.equals(charArray1, charArray2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are NOT anagrams");
		}
	}

//	using iterative method

	static void isAnagram2(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();

		Boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		}

		else {

			char[] charArray1 = str1.toCharArray();

			for (char c : charArray1) {

				int index = str2.indexOf(c);
				if (index != -1) {
//					if char is present in str2, remove that char
					str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
					status = true;
				} else {
					status = false;
				}

			}
			if (status) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are NOT anagrams");
			}
		}
	}

//	using StringBuilder

	static void isAnagram3(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();

		Boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		}

		else {

			char[] charArray1 = str1.toCharArray();

			StringBuilder sb = new StringBuilder(str2);

			for (char c : charArray1) {
				int index = sb.indexOf("" + c);
				if (index != -1) {
//					if char present in sb, remove that char
					sb = sb.deleteCharAt(index);
				} else {
					status = false;
				}
			}
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are NOT anagrams");
		}
	}

}
