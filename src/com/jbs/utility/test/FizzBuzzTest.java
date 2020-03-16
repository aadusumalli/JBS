/**
 * Test cases  For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz" and For numbers which are multiples of both three and five print "FizzBuzz". 
 */
package com.jbs.utility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.jbs.utility.FizzBuzz;

/**
 * @author Anil
 *
 */
public class FizzBuzzTest {

	@Test 
	public void fizzBuzzConvertorLeavesNormalNumbersAlone(){ 
		FizzBuzz fizzBuzz = new FizzBuzz(); 
		Assert.assertEquals("1", fizzBuzz.eval(1)); 
	}

	@Test
	public void testMultipleOfThreeAndFivePrintsFizzBuzz() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.eval(15));
	}

	@Test
	public void testMultipleOfThreeOnlyPrintsFizz() {
		assertEquals("Fizz", FizzBuzz.eval(12));
	}

	@Test
	public void testMultipleOfFiveOnlyPrintsBuzz() {
		assertEquals("Buzz", FizzBuzz.eval(10));
	}

	@Test
	public void testNonMulitpleOfThreeOrFivePrintsTheNumber() {
		assertEquals("11", FizzBuzz.eval(11));
	}

}
