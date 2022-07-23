package com.aman.lambda;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {
		
		// Java Lambda Expression Example: Foreach Loop
		
		   List<String> list=new ArrayList<String>();  
	        list.add("Rohit");  
	        list.add("Pant");  
	        list.add("Virat");  
	        list.add("Surya");  
		
	        //for each loop without lambda
	        for(String s1: list) {
	        	System.out.println(s1);
	        }
	        
	        System.out.println("======================");
	        
	        
	        // for each using lambda
	        list.forEach(
	        		s2 -> System.out.println(s2)
	        	);
	        
	        
		
	}
}
