package com.aman.interview;

public class BinaryNumberOrNot {

	public static void main(String[] args) {
		
		isBinaryOrNot(10101101);
		isBinaryOrNot(101023101);
		isBinaryOrNot(1010110);
		isBinaryOrNot(10170110);
		
	}
	
	static void isBinaryOrNot(int number) {
		
		int n=number;
		boolean status=true;
		
		while(n!=0) {
			int lastDigit=n%10;
			if(lastDigit>1) {
				status=false;
				break;
			}
			else {
				n=n/10;
			}
		}
		if(status)
		{
			System.out.println(number+ " is a Binary number");
		}
		else {
			System.out.println(number+ " is NOT a Binary number");
		}
		
		
		
		
		
		
	}
	
	
	
	
}



