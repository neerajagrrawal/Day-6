package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.domain.MathException;
import com.capgemini.domain.MyCalculator;
import com.capgemini.domain.ZeroInputException;

class MyCalculatorTest {

	MyCalculator c1 ;
	
	@BeforeEach
	void setup()
	{
		c1 = new MyCalculator() ;
	}
	
	

	@Test
	void testPowerWithValidInputs() throws MathException, ZeroInputException {
			assertEquals(243,c1.power(3, 5));
			assertEquals(16,c1.power(2, 4));
			}
	
	@Test
	void testPowerWithZeroInputs() throws MathException, ZeroInputException {
		Exception e=assertThrows(ZeroInputException.class, () -> c1.power(0, 0));
		assertEquals("n and p should not be zero",e.getMessage()) ;
		}
	
	@Test
	void testPowerWithNegativeInputs() throws MathException, ZeroInputException {
		Exception e ;
		e=assertThrows(MathException.class, () -> c1.power(-1, -2));
		assertEquals("n or p should be non-negative",e.getMessage()) ;
		e=assertThrows(MathException.class, () -> c1.power(-1, 3));
		assertEquals("n or p should be non-negative",e.getMessage()) ;
		}
	
	
	
	
	
	
	

}
