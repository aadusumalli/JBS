/**
 * For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz" 
 */
package com.jbs.utility;

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
		System.out.println(convert(n));
		//System.out.println(eval(n));
	}


	/**
	 * @param n
	 */
	public static String convert(int n) {
		StringBuffer sb = new StringBuffer();
		// loop for 100 times 
		for (int i=1; i<=n; i++)                                  
		{ 
			// number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number 
			if (i%15==0)                                                  
				sb.append("FizzBuzz"+" ");  
			// number divisible by 5, print 'Buzz'  in place of the number 
			else if (i%5==0)      
				sb.append("Buzz"+" "); 
			// number divisible by 3, print 'Fizz' in place of the number 
			else if (i%3==0)      
				sb.append("Fizz"+" ");
			else // print the numbers 
				sb.append(i+" ");                          
		}
		return sb.toString();
	}


	/**
	 * @param n - integer
	 */
	public static String eval(Integer inputVal) {
		StringBuffer sb = new StringBuffer();
		if (inputVal % (3*5) == 0) sb.append("FizzBuzz"); // number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number 
		else if(inputVal % 5 == 0) sb.append("Buzz"); // number divisible by 5, print 'Buzz'  in place of the number
		else if(inputVal % 3 == 0) sb.append("Fizz"); // number divisible by 3, print 'Fizz' in place of the number
		else sb.append(inputVal); // print the numbers
		return sb.toString();
	}

	public static String printByParam(int n) {
		StringBuffer sb = new StringBuffer();
		// loop for 100 times 
		for (int i=1; i<=n; i++)                                  
		{ 
			// number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number 
			if (i%15==0)                                                  
				sb.append("FizzBuzz"+" ");  
			// number divisible by 5, print 'Buzz'  in place of the number 
			else if (i%5==0)      
				sb.append("Buzz"+" "); 
			// number divisible by 3, print 'Fizz' in place of the number 
			else if (i%3==0)      
				sb.append("Fizz"+" ");
			else // print the numbers 
				sb.append(i+" ");                          
		}
		return sb.toString();
	}

}
