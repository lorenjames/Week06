package tests;

import static org.junit.jupiter.api.Assertions.*;
import unitTesting.Math;

import org.junit.jupiter.api.Test;

class MathTest {
	
	Math math = new Math();

	@Test
	void testMultiplyReturnsCorrectValues() {
		
		int product = math.multiply(2, 5);
		assertEquals(10, product);
		
	}
	
	/*
	 * @Test void testDivideReturnsCorrectValues() { double result = math.divide(5,
	 * 2); assertEquals(2.5, result); }
	 */
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	void testIsDivideThrowsExceptionWhenDividingBy0() {
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
	}

}
