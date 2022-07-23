package com.aman.interview;


public class StringReverse {

	public static void main(String[] args) {

		String str = "Javaken";
		
//		using reverse api
		
		StringBuilder sb=new StringBuilder(str);

		String s=sb.reverse().toString();
		System.out.println("using reverse api ="+s);
		
		String revStr=reverseString(str);
		System.out.println(revStr);
		
		System.out.println(revString("AMAN"));
		
		System.out.println(revString2("INDIA"));
		
	}

//	using recursive method
	public static String reverseString(String s) {
		if (s.isEmpty()) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);

	}
	
//	using iterative method
	public static String revString(String s) {
		if (s.isEmpty()) {
			return s;
		}
		String str="";
		
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		return str;
		
	}
	
//	using StringBuilder
	public static String revString2(String s) {
		if (s.isEmpty()) {
			return s;
		}
		StringBuilder sb=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
		
	}

}
