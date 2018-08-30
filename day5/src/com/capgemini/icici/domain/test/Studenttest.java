package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.AgeNotWithinRangeException;
import com.capgemini.icici.domain.NameNotValidException;
import com.capgemini.icici.domain.Student;

class Studenttest {

	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
			assertEquals(null,new Student(11,"Spandhu",21,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Spandhu",22,"Java"));
		
	}

}
