package com.capgemini.domain;

public class TaxCalculator {
	
	public double calculateTax(String empName,boolean isIndian,double empSal) throws Exception
	{
		double taxAmount=0 ;
		if(!isIndian)
			throw new CountryNotValidException() ;
		
		if(empName==null || empName=="")
			throw new EmployeeNameInvalidException() ;
		
		if(empSal>100000)
			taxAmount=empSal*0.08 ;
		
		else if(empSal<=100000 && empSal>50000)
			taxAmount=empSal*0.06 ;
		
		else if(empSal<=50000 && empSal>30000)
			taxAmount=empSal*0.05 ;
		
		else if(empSal<=30000 && empSal>10000)
			taxAmount=empSal*0.04 ;
		
		else if(empSal<=10000)
			throw new TaxNotEligibleException() ;
		
		else
			return taxAmount ;
		
		return taxAmount ;
		
		
		
	

}
	}
