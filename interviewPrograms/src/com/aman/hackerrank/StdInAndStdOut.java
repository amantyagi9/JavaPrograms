package com.aman.hackerrank;

import java.util.Scanner;

public class StdInAndStdOut {

    public static void main(String[] args) {
    	
    	
        Scanner scan = new Scanner(System.in);
    
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
   
   /*
 Note: If you use the nextLine() method immediately following the nextInt() method, 
 recall that nextInt() reads integer tokens; because of this, the last newline character
  for that line of integer input is still queued in the input buffer and the next nextLine()
  will be reading the remainder of the integer line (which is empty). 
  The nextLine() method reads the text until the end of the line. After reading the line, 
  it throws the cursor to the next line.
  Java next() method can read the input before the space id found. It cannot read two words 
  separated by space. It retains the cursor in the same line after reading the input.
    */
        
      

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}