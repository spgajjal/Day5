package com.capgemini.icici.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.CountryNotValidException;
import com.capgemini.icici.domain.EmployeeNameInValidException;
import com.capgemini.icici.domain.TaxCalculator;
import com.capgemini.icici.domain.TaxNotEligibleException;

class TaxCalculatortest {

	@Test
	void testCountryNotValidException()throws CountryNotValidException  {
		
		assertThrows(CountryNotValidException.class,() -> TaxCalculator.calculatetax("spandhana",false,50000));
	}
	
	void testTaxNotEligibleException()throws TaxNotEligibleException{
		assertThrows(TaxNotEligibleException.class,() -> TaxCalculator.calculatetax("spandhana",true,9000));
	}
	void testEmployeeNameInValidException()throws EmployeeNameInValidException{
		assertThrows(EmployeeNameInValidException.class,() -> TaxCalculator.calculatetax("spandhana",true,9000));
	}
	
}
