package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.FactorialException;

class FactorialTest {

	@Test
	void testGetFactorial() throws Exception {
		FactorialTest f1=new FactorialTest() ;
		assertThrows(FactorialException.class,()->f1.getFactorial(100));
		assertEquals(120,f1.getFactorial(5));
	}

	



}
