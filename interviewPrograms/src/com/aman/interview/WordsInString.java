package com.aman.interview;

public class WordsInString {

	public static void main(String[] args) {
		
		String str="Java is an  Object oriented programming language.";
		
		wordCount(str);
	}
	
	
	static void wordCount(String s) {
		
		int  count = 1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' &&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("No of words in string are: "+count);
		
	}
	
	
}
