package com.aman.pattern;

public class NumericPattern3 {

	public static void main(String[] args) {

		
/* 
			Pascal’s Triangle
			
		             1
		           1   1
		         1   2   1
		       1   3   3   1
		     1   4   6   4   1

 */
		

	      int  i, j, k, num;
	      for(i= 0; i< 5 ; i++)
	      {
	         for(j=i; j<4; j++)
	         {
	            System.out.print(" ");
	         }
	         num=1;
	         for(k=0; k<=i; k++)
	         {
	            System.out.print(num+ " ");
	            num = num*(i-k)/(k+1);
	         }
	         System.out.println();
	      }
		
		
	}

}
