package com.aman.hackerrank;

//Problem: https://www.hackerrank.com/challenges/cut-the-sticks

import java.util.*;

public class CutTheSticks {

	
	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter stick count: ");
	        int N = input.nextInt();
	        int [] sticks = new int[N];
	        
	        for(int i = 0; i < N; i++)
	        {
	        	System.out.println("Enter stick length: ");
	            sticks[i] = input.nextInt();
	        }
	        
	        Arrays.sort(sticks);
	        
	        
	        int sticksLeft = N;
	        
	        int curr = sticks[0];
	        int currCount = 0;
	        System.out.println(N);
	        
	        for(int i = 0; i < N; i++)
	        {
	            if(curr == sticks[i])
	            {
	                currCount++;
	            }
	            else
	            {
	                sticksLeft -= currCount;
	                currCount = 1;
	                curr = sticks[i];
	                System.out.println(sticksLeft);
	            }
	        }
	        
	        input.close();
	        
	    }
	}