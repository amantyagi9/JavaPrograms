package com.aman.hackerrank;

// Problem: https://www.hackerrank.com/challenges/service-lane

/*
 
 A driver is driving on the freeway. The check engine light of his vehicle is on, and
  the driver wants to get service immediately. Luckily, a service lane runs parallel 
  to the highway. It varies in width along its length.

Paradise Highway

You will be given an array of widths at points along the road (indices), then a list of the
 indices of entry and exit points. Considering each entry and exit point pair, calculate the 
 maximum size vehicle that can travel that segment of the service lane safely.

Example

n=4

width=[2,3,2,1]

cases=[[1,2],[2,4]]

If the entry index, i=1 and the exit, j=2 , there are two segment widths of 2 and 3 respectively. The widest vehicle that can fit through both is 2. If i=2 and j=4, the widths are [3,2,1] which limits vehicle width to 1.

Function Description

Complete the serviceLane function in the editor below.

serviceLane has the following parameter(s):

int n: the size of the width array
int cases[t][2]: each element contains the starting and ending indices for a segment to 
consider, inclusive Returns

int[t]: the maximum width vehicle that can pass through each segment of the service lane 
described

Input Format

The first line of input contains two integers,n and t, where n denotes the number of width
 measurements and ,t the number of test cases. The next line has n space-separated integers 
 which represent the array .

The next lines contain two integers, i and j, where i is the start index and j is the end 
index of the segment to check. 

 */



import java.util.*;

public class ServiceLane {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = scan.nextInt();
		System.out.println("Enter test cases: ");
		int t = scan.nextInt();
		
		int[] width = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter width of service lane: ");
			width[i] = scan.nextInt();
		}
		for (int i = 0; i < t; i++) {
			System.out.println("Enter start point: ");
			int start = scan.nextInt();
			System.out.println("Enter end point: ");
			int end = scan.nextInt();
			
			System.out.println(serviceLane(width, start, end));
		}
		scan.close();
	}

	public static int serviceLane(int[] width, int start, int end) {
		int maxVehicleSize = 3;
		for (int j = start; j <= end; j++) {
			if (width[j] < maxVehicleSize) {
				maxVehicleSize = width[j];
			}
		}
		return maxVehicleSize;
	}

}
