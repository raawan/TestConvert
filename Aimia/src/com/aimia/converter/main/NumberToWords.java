package com.aimia.converter.main;

import com.aimia.converter.logic.MainConverter;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		return new MainConverter().convert(Integer.valueOf(number, 10));
	}
}
