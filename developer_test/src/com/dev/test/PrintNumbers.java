/**
 * Write a program that prints the numbers from 1 to 100.
 */
package com.dev.test;

/**
 * @author Anil
 *
 */
public class PrintNumbers {
	// Prints numbers from 1 to n 
	static void printNumbers(int n) 
	{ 
		if (n > 0) 
		{ 
			printNumbers(n - 1); 
			System.out.print(n + " ");
			//System.out.println(n + " "); 
		} 
		return;
	} 

	// Driver Code 
	public static void main(String[] args)  
	{ 
		printNumbers(100); 
	} 

}
