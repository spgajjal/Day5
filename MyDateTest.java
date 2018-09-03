package com.capgemini.icici.domain.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.capgemini.icici.domain.InvalidDayException;
import com.capgemini.icici.domain.InvalidMonthException;
import com.capgemini.icici.domain.MyDate;

class MyDateTest {

	@Test
	void testValidCases() {
		try {
			MyDate d1= new MyDate(29,2,1996) ;
			MyDate d2= new MyDate(12,12,1996) ;
			MyDate d3= new MyDate(31,3,1996) ;
		}
		catch(Exception e)
		{
			fail("Exception occured") ;
		}
	}
	
	void testInvalidCases() {
		assertThrows(InvalidMonthException.class,()->new MyDate(12,13,1996));
		assertThrows(InvalidDayException.class,()->new MyDate(31,11,1996));
		assertThrows(InvalidDayException.class,()->new MyDate(29,2,1997));
		assertThrows(InvalidDayException.class,()->new MyDate(32,12,1996));
		
	}

}