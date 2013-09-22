package com.aimia.converter.main;

import com.aimia.converter.logic.IConverter;
import com.aimia.converter.logic.MainConverter;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		int inputNumber = Integer.valueOf(number, 10);
		IConverter converter = new MainConverter();
		return converter.convert(inputNumber);
	}
}
