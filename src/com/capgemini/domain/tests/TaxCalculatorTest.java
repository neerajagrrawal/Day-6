package com.capgemini.domain.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.AgeNotWithinRangeException;
import com.capgemini.domain.CountryNotValidException;
import com.capgemini.domain.EmployeeNameInvalidException;
import com.capgemini.domain.NameNotValidException;
import com.capgemini.domain.Student;
import com.capgemini.domain.TaxCalculator;
import com.capgemini.domain.TaxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testValidCases() throws Exception {
		
			TaxCalculator t1= new TaxCalculator() ;
			assertEquals(4000000,t1.calculateTax("neeraj", true,50000000)) ;
			assertEquals(40000,t1.calculateTax("neeraj", true,500000)) ;
		}
	
	@Test
	void testInvalidTestCase()
	{
		TaxCalculator t1=new TaxCalculator() ;
		assertThrows(CountryNotValidException.class,()->t1.calculateTax("neeraj",false,30000));
		assertThrows(EmployeeNameInvalidException.class,()->t1.calculateTax("", true, 30000));
		assertThrows(TaxNotEligibleException.class,()->t1.calculateTax("neeraj", true, 3000));
		
	}

}
