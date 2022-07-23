package com.aman.hackerrank;


import java.io.*;
import java.util.*;

public class Demo {
    
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(2);
		list.add(3);
		
		int sum = 0;
		 for(int i: list) {
			 sum += i;
			 System.out.println(i);
		 }
		 System.out.println(sum);
		
		
	}
}