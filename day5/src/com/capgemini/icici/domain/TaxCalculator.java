package com.capgemini.icici.domain;

public class TaxCalculator {
	
	public static double calculatetax(String empName,boolean isIndian,long empSal)throws EmployeeNameInValidException,TaxNotEligibleException,CountryNotValidException
	{
	double taxAmount;
	if(!isIndian) 
		throw new CountryNotValidException("Employee should be Indian");
	
	else if(empName== " " || empName == null) 
			throw new EmployeeNameInValidException("employee name should not be empty");
		
		
	else if(empSal<10000)
				throw new TaxNotEligibleException("No Tax");
	else {
		if(empSal>=100000) {
			taxAmount=(double)(empSal*0.08);
		return taxAmount;
		}
			else if(empSal>50000 || empSal <100000) {
					taxAmount=(double)(empSal*0.06);
				return taxAmount;
			}
			else if(empSal>30000 || empSal <50000) {
					taxAmount=(double)(empSal*0.05);
				return taxAmount;
				
			}
			else {
			
				taxAmount=(double)(empSal*0.04);
				return taxAmount;
				}
		
	}
	}

	
}
		
	
		






			