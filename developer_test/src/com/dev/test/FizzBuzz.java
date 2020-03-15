/**
 * For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz" 
 */
package com.dev.test;

/**
 * @author Anil
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100; 
        solution1(n);
        //solution2(n);
	}


	/**
	 * @param n
	 */
	private static void solution1(int n) {
		// loop for 100 times 
        for (int i=1; i<=n; i++)                                  
        { 
        	// number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number 
            if (i%15==0)                                                  
                System.out.println("FizzBuzz"+" ");  
            // number divisible by 5, print 'Buzz'  in place of the number 
            else if (i%5==0)      
                System.out.println("Buzz"+" "); 
            // number divisible by 3, print 'Fizz' in place of the number 
            else if (i%3==0)      
                System.out.println("Fizz"+" ");
            else // print the numbers 
                System.out.println(i+" ");                          
        }
	}
	

	/**
	 * @param n
	 */
	private static void solution2(int n) {
		for(int i = 1; i <= n; i++) {
            if(i % (3*5) == 0) System.out.println("FizzBuzz"); // number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number 
            else if(i % 5 == 0) System.out.println("Buzz"); // number divisible by 5, print 'Buzz'  in place of the number
            else if(i % 3 == 0) System.out.println("Fizz"); // number divisible by 3, print 'Fizz' in place of the number
            else System.out.println(i); // print the numbers
        }		
	}

}
