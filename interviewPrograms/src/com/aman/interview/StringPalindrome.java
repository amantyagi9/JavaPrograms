package com.aman.interview;

public class StringPalindrome {

	public static void main(String[] args) {
		
		/*
		 * A Palindrome is a String which is equal to the reverse of itself e.g. "Bob"
		 * is a palindrome because of the reverse of "Bob" is also "Bob" 
		 * "malayalam"
		 */
		
		isPalindrome("malayalam");
		isPalindrome("Aman");
		isPalindrome2("malayalam");
		isPalindrome2("Aman");
		System.out.println(isPalindrome3("malayalam"));
		System.out.println(isPalindrome3("developer"));
		
	}

//	using stringbuilder
	static void isPalindrome(String s) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)	{
			sb=sb.append(s.charAt(i));
		}
		if(s.equalsIgnoreCase(sb.toString())) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	
	}
	
//	using library methods
	
	static void isPalindrome2(String s) {
		
		StringBuilder sb=new StringBuilder(s).reverse();
		String newStr=sb.toString();
		if(s.equalsIgnoreCase(newStr)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
	}
	
//	without stringbuilder
	static boolean isPalindrome3(String str) {
		String s=str.toLowerCase();
		int n=s.length();
		
		for(int i=0;i<=n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	
}
