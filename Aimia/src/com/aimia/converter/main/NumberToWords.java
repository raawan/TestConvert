package com.aimia.converter.main;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		IConverter converter = null;
		int inputNumber = Integer.valueOf(number, 10);
		if(inputNumber<20)
		{
			converter = new UnitConverter();
		}
		else
		{
			converter = new TensConverter();
		}
		return converter.convert(inputNumber);
	}
}
