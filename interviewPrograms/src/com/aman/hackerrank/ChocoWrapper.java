package com.aman.hackerrank;

public class ChocoWrapper {

	public static void main(String[] args) {

		/*
		 * Little Bobby loves chocolate. He frequently goes to his favorite 5 & 10
		 * store, Penny Auntie, to buy them. They are having a promotion at Penny
		 * Auntie. If Bobby saves enough wrappers, he can turn them in for a free
		 * chocolate.
		 * 
		 * Example
		 * 
		 * n=15 
		 * c=3 
		 * m=2 
		 * 
		 * He has 15 to spend, bars cost 3, and he can turn in 2 wrappers
		 * to receive another bar. Initially, he buys 5 bars and has 5 wrappers after
		 * eating them. He turns in 4 of them, leaving him with 1, for 2 more bars.
		 * After eating those two, he has 3 wrappers, turns in 2 leaving him with 1
		 * wrapper and his new bar. Once he eats that one, he has wrappers and turns
		 * them in for another bar. After eating that one, he only has 1 wrapper, and
		 * his feast ends. Overall, he has eaten 5+2+1+1=9 bars.
		 * 
		 */
		
		
		int result = chocolateFeast(15, 3, 2);
		System.out.println("Total Chocolates: "+ result);
		
	}
	
	
	public static int chocolateFeast(int n, int c, int m) {
	    
		int chocoCount = n/c;
		int wrapperCount = chocoCount;
		
		while(wrapperCount >= m) {
			chocoCount = chocoCount +  wrapperCount / m;
			wrapperCount =  wrapperCount / m + wrapperCount % m;
			
		}
		return chocoCount;

	    }
	
//	static void choco() {
//		
//		int n = 15;
//		int c = 3;
//		int m = 2;
//		
//		int chocoCount = n/c;
//		int wrapperCount = chocoCount;
//		
//		while(wrapperCount >= m) {
//			chocoCount = chocoCount +  wrapperCount / m;
//			wrapperCount =  wrapperCount / m + wrapperCount % m;
//			
//		}
//		
//		System.out.println("Total Number of Chocolates: " + chocoCount);
//		
//		
//		
//		
//	}

}
