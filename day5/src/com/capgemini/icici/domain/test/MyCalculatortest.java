package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.MyCalculator;
//import com.capgemini.icici.domain.ZeroException;

class MyCalculatortest {

	@Test
	void testPower() throws Exception {
		assertEquals(243,MyCalculator.power(3,5));
		assertEquals(16,MyCalculator.power(2,4));
		assertEquals(32,MyCalculator.power(2,5));
		
	
	}
	@Ignore
	@Test
	void testPowerWithValidInputs() {
     Exception e;
		
		e=assertThrows(Exception.class, ()->MyCalculator.power(0,0));
		assertEquals("n and p should not be zero",e.getMessage());
		
	}
	
	@Ignore
	@Test
	void testPowerWithNegativeInputs() {
     Exception e;
     e=assertThrows(Exception.class, ()->MyCalculator.power(-2,-5));
     assertEquals("n and p should not be negative",e.getMessage());
     e=assertThrows(Exception.class, ()->MyCalculator.power(-2,5));
     assertEquals("n and p should not be negative",e.getMessage());
		assertThrows(Exception.class, ()->MyCalculator.power(1,-3));
		assertEquals("n and p should not be negative",e.getMessage());
		
}
}
