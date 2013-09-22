package com.aimia.converter.main;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		int inputNumber = Integer.valueOf(number, 10);
		IConverter converter = new DefaultConverter();
		return converter.convert(inputNumber);
	}
}
